package org.TaskTracker.domain.task;

import org.TaskTracker.interfaces.task.TaskDto;

import java.util.List;

public interface TaskService {
    List<TaskDto> getTasks();
}
