package org.TaskTracker.infrastructure.task;

import lombok.RequiredArgsConstructor;
import org.TaskTracker.domain.task.TaskReader;
import org.TaskTracker.infrastructure.task.repository.TaskRepository;
import org.TaskTracker.interfaces.task.TaskDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TaskReaderImpl implements TaskReader {
    private final TaskRepository taskRepository;
    @Override
    public List<TaskDto> getTasks() {
        return taskRepository.findAllById();
    }
}
