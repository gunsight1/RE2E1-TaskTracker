package org.TaskTracker.domain.task;

import lombok.RequiredArgsConstructor;
import org.TaskTracker.interfaces.task.TaskDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskStore taskStore;
    private final TaskReader taskReader;

    @Override
    public List<TaskDto> getTasks() {
        return taskReader.getTasks();
    }
}
