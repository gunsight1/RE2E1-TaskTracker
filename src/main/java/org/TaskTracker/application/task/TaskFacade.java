package org.TaskTracker.application.task;

import lombok.RequiredArgsConstructor;
import org.TaskTracker.domain.task.TaskService;
import org.TaskTracker.interfaces.task.TaskDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskFacade {
    private final TaskService taskService;
    //TODO DDD강의 수강 후 FACADE의 역할이 무엇인지 고려하여 구현
    public List<TaskDto> getTasks() {
        return taskService.getTasks();
    }
}
