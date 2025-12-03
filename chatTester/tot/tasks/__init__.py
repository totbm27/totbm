def get_task(name, content):
    if content is None:
        raise ValueError("content cannot be None")
    if name == 'intention':
        from tot.tasks.intention import IntentionTask
        return IntentionTask(content=content)
    elif name == 'gentest':
        from tot.tasks.gentest import GenTestTask
        return GenTestTask(content=content)
    elif name == 'repair':
        from tot.tasks.repair import RepairTask
        return RepairTask(content=content)
    else:
        raise NotImplementedError
