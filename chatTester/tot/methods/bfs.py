import itertools
import numpy as np
from functools import partial
from tot.models import gpt, system_role_gpt


def get_value(task, x, y, n_evaluate_sample, cache_value=True):
    value_prompt = task.value_prompt_wrap(x, y)
    if cache_value and value_prompt in task.value_cache:
        return task.value_cache[value_prompt]
    if task.get_system_role_prompt("value") != "":
        value_outputs = system_role_gpt(
            task.get_system_role_prompt("value"), value_prompt, n=n_evaluate_sample, stop=None
        )
    else:
        value_outputs = gpt(value_prompt, n=n_evaluate_sample, stop=None)
    value = task.value_outputs_unwrap(x, y, value_outputs)
    if cache_value:
        task.value_cache[value_prompt] = value
    return value


def get_values(task, x, ys, n_evaluate_sample, cache_value=True):
    values = []
    local_value_cache = {}
    for y in ys:  # each partial output
        if y in local_value_cache:  # avoid duplicate candidates
            value = 0
        else:
            value = get_value(task, x, y, n_evaluate_sample, cache_value=cache_value)
            local_value_cache[y] = value
        values.append(value)
    return values


def get_votes(task, x, ys, n_evaluate_sample):
    vote_prompt = task.vote_prompt_wrap(x, ys)
    if task.get_system_role_prompt("vote") != "":
        vote_outputs = system_role_gpt(task.get_system_role_prompt("vote"), vote_prompt, n=n_evaluate_sample, stop=None)
    else:
        vote_outputs = gpt(vote_prompt, n=n_evaluate_sample, stop=None)
    values = task.vote_outputs_unwrap(vote_outputs, len(ys))
    return values


def get_proposals(task, x, y):
    propose_prompt = task.propose_prompt_wrap(x, y)
    if task.get_system_role_prompt("propose") != "":
        proposals = system_role_gpt(task.get_system_role_prompt("propose"), propose_prompt, n=1, stop=None)[0].split(
            "\n"
        )
    else:
        proposals = gpt(propose_prompt, n=1, stop=None)[0].split("\n")
    return [y + _ + "\n" for _ in proposals]


def get_samples(task, x, y, n_generate_sample, prompt_sample, stop):
    if prompt_sample == "standard":
        prompt = task.standard_prompt_wrap(x, y)
    elif prompt_sample == "cot":
        prompt = task.cot_prompt_wrap(x, y)
    else:
        raise ValueError(f"prompt_sample {prompt_sample} not recognized")
    if task.get_system_role_prompt(prompt_sample) != "":
        system_role_prompt = task.get_system_role_prompt(prompt_sample)
        samples = system_role_gpt(system_role_prompt, prompt, n=n_generate_sample, stop=stop)
    else:
        samples = gpt(prompt, n=n_generate_sample, stop=stop)
    # return [y + _ for _ in samples]
    return [_ for _ in samples]


def get_merge_sample(task, x, un_select_new_ys, un_select_new_ys_values, missing_sample, step):
    """
    Generate new samples by merging unselected candidates with unavailable values.
    """
    new_ys = []
    merge_group = []
    ids = list(range(len(un_select_new_ys)))
    select_ids = sorted(ids, key=lambda x: un_select_new_ys_values[x], reverse=True)
    index = 0
    while len(select_ids) > index:
        if len(select_ids) - index > missing_sample:  # get merge group
            merge_group.append(select_ids[index : index + 2])  # select two candidates to merge
            index += 2
        else:  # get re-generate
            merge_group.append(select_ids[index : index + 1])  # select the rest candidates to re-generate
            index += 1

    for i in range(len(merge_group)):
        if len(merge_group[i]) == 2:
            print(f"merge_group {i}: {merge_group[i]}")
            merge_ys = un_select_new_ys[merge_group[i][0]] + un_select_new_ys[merge_group[i][1]]
            if step == 0:  # plan
                merge_prompt = task.merge_plan_prompt_wrap(x, merge_ys)
                if task.get_system_role_prompt("merge_plan") != "":
                    system_role_prompt = task.get_system_role_prompt("merge_plan")
                    new_samples = system_role_gpt(system_role_prompt, merge_prompt, n=1, stop=None)
                else:
                    new_samples = gpt(merge_prompt, n=1, stop=None)
            else:  # method
                merge_prompt = task.merge_method_prompt_wrap(x, merge_ys)
                if task.get_system_role_prompt("merge_method") != "":
                    system_role_prompt = task.get_system_role_prompt("merge_method")
                    new_samples = system_role_gpt(system_role_prompt, merge_prompt, n=1, stop=None)
                else:
                    new_samples = gpt(merge_prompt, n=1, stop=None)
        else:
            print(f"refine {i}: {merge_group[i]}")
            refine_ys = un_select_new_ys[merge_group[i][0]]
            if step == 0:  # plan
                re_generate_prompt = task.refine_plan_prompt_wrap(x, refine_ys)
                if task.get_system_role_prompt("refine_plan") != "":
                    system_role_prompt = task.get_system_role_prompt("refine_plan")
                    new_samples = system_role_gpt(system_role_prompt, re_generate_prompt, n=1, stop=None)
                else:
                    new_samples = gpt(re_generate_prompt, n=1, stop=None)
            else:  # method
                re_generate_prompt = task.refine_method_prompt_wrap(x, refine_ys)
                if task.get_system_role_prompt("refine_method") != "":
                    system_role_prompt = task.get_system_role_prompt("refine_method")
                    new_samples = system_role_gpt(system_role_prompt, re_generate_prompt, n=1, stop=None)
                else:
                    new_samples = gpt(re_generate_prompt, n=1, stop=None)
        new_ys.append(new_samples)

    return new_ys


def solve(args, task, idx, to_print=True):
    global gpt, system_role_gpt
    gpt = partial(gpt, model=args.backend, temperature=args.temperature, max_tokens=args.max_tokens)
    system_role_gpt = partial(
        system_role_gpt, model=args.backend, temperature=args.temperature, max_tokens=args.max_tokens
    )
    print(gpt)
    print(system_role_gpt)
    x = task.get_input(idx)  # input
    ys = [""]  # current output candidates
    infos = []
    for step in range(task.steps):
        # generation
        if args.method_generate == "sample":
            new_ys = [
                get_samples(task, x, y, args.n_generate_sample, prompt_sample=args.prompt_sample, stop=task.stops[step])
                for y in ys
            ]
        elif args.method_generate == "propose":
            new_ys = [get_proposals(task, x, y) for y in ys]
        new_ys = list(itertools.chain(*new_ys))
        ids = list(range(len(new_ys)))
        # evaluation
        if args.method_evaluate == "vote":
            values = get_votes(task, x, new_ys, args.n_evaluate_sample)
        elif args.method_evaluate == "value":
            values = get_values(task, x, new_ys, args.n_evaluate_sample)

        # selection
        if args.method_select == "sample":
            ps = np.array(values) / sum(values)
            select_ids = np.random.choice(ids, size=args.n_select_sample, p=ps).tolist()
        elif args.method_select == "greedy":
            select_ids = sorted(ids, key=lambda x: values[x], reverse=True)[: args.n_select_sample]
        select_new_ys = [new_ys[select_id] for select_id in select_ids]

        # log
        if to_print:
            sorted_new_ys, sorted_values = zip(*sorted(zip(new_ys, values), key=lambda x: x[1], reverse=True))
            print(f"-- new_ys --: {sorted_new_ys}\n-- sol values --: {sorted_values}\n-- choices --: {select_new_ys}\n")

        infos.append(
            {"step": step, "x": x, "ys": ys, "new_ys": new_ys, "values": values, "select_new_ys": select_new_ys}
        )
        ys = select_new_ys

    if to_print:
        print(ys)
    return ys, {"steps": infos}


def merge_solve(args, task, idx, to_print=True):
    global gpt, system_role_gpt
    gpt = partial(gpt, model=args.backend, temperature=args.temperature, max_tokens=args.max_tokens)
    system_role_gpt = partial(
        system_role_gpt, model=args.backend, temperature=args.temperature, max_tokens=args.max_tokens
    )
    print(gpt)
    print(system_role_gpt)
    x = task.get_input(idx)  # input
    ys = [""]  # current output candidates
    infos = []
    for step in range(task.steps):
        # generation
        if args.method_generate == "sample":
            new_ys = [
                get_samples(task, x, y, args.n_generate_sample, prompt_sample=args.prompt_sample, stop=task.stops[step])
                for y in ys
            ]
        elif args.method_generate == "propose":
            new_ys = [get_proposals(task, x, y) for y in ys]
        new_ys = list(itertools.chain(*new_ys))
        ids = list(range(len(new_ys)))
        select_new_ys, select_new_ys_values, candidate_ys, candidate_ys_values = [], [], [], []
        merge = 0
        refine = 0

        while len(select_new_ys) < args.n_select_sample:
            n_select = args.n_select_sample - len(select_new_ys)

            # evaluation new_ys
            if args.method_evaluate == "vote":  # 0, n
                values = get_votes(task, x, new_ys, args.n_evaluate_sample)
                available_ids = [i for i in ids if values[i] > 0]
            elif args.method_evaluate == "value":  # 0.001, 1, 20
                values = get_values(task, x, new_ys, args.n_evaluate_sample)
                available_ids = [i for i in ids if values[i] > 3]
            
            if refine > 0:
                available_ids = [i for i in ids]

            # merge selection and new available candidates
            candidate_ys = select_new_ys
            candidate_ys_values = select_new_ys_values
            for id in available_ids:
                candidate_ys.append(new_ys[id])
                candidate_ys_values.append(values[id])
            candidate_ids = list(range(len(candidate_ys)))

            # selection from available candidates
            if args.method_select == "sample":
                ps = np.array(candidate_ys_values) / sum(candidate_ys_values)
                select_ids = np.random.choice(candidate_ids, size=n_select, p=ps).tolist()
            elif args.method_select == "greedy":
                select_ids = sorted(candidate_ids, key=lambda x: candidate_ys_values[x], reverse=True)[:n_select]

            select_new_ys = [candidate_ys[select_id] for select_id in select_ids]
            select_new_ys_values = [candidate_ys_values[select_id] for select_id in select_ids]
            un_select_new_ys = [new_ys[id] for id in ids if id not in available_ids]
            un_select_new_ys_values = [values[id] for id in ids if id not in available_ids]
            missing_sample = args.n_select_sample - len(select_new_ys)

            # log
            if merge == 0:  # first selection
                if to_print:
                    sorted_new_ys, sorted_values = zip(*sorted(zip(new_ys, values), key=lambda x: x[1], reverse=True))
                    print(
                        f"-- new_ys --: {sorted_new_ys}\n-- sol values --: {sorted_values}\n-- choices --: {select_new_ys}\n"
                    )

                infos.append(
                    {"step": step, "x": x, "ys": ys, "new_ys": new_ys, "values": values, "select_new_ys": select_new_ys}
                )
            else:  # merged selection
                if to_print:
                    sorted_new_ys, sorted_values = zip(*sorted(zip(new_ys, values), key=lambda x: x[1], reverse=True))
                    print(
                        f"-- new_ys --: {sorted_new_ys}\n-- sol values --: {sorted_values}\n-- choices --: {select_new_ys}\n"
                    )

                infos.append(
                    {
                        "merge": merge,
                        "new_ys": new_ys,
                        "values": values,
                        "select_new_ys": select_new_ys,
                        "un_select_new_ys": un_select_new_ys,
                    }
                )

            # merge
            if len(select_new_ys) == args.n_select_sample:
                break
            else:
                if len(un_select_new_ys) == 1:
                    refine += 1
                merge += 1
                new_ys = get_merge_sample(task, x, un_select_new_ys, un_select_new_ys_values, missing_sample, step)
                new_ys = list(itertools.chain(*new_ys))
                ids = list(range(len(new_ys)))

        ys = select_new_ys

    if to_print:
        print(ys)
    return ys, {"steps": infos}


def naive_solve(args, task, idx, to_print=True):
    global gpt
    gpt = partial(gpt, model=args.backend, temperature=args.temperature, max_tokens=args.max_tokens)
    print(gpt)
    x = task.get_input(idx)  # input
    ys = get_samples(task, x, "", args.n_generate_sample, args.prompt_sample, stop=None)
    return ys, {}
