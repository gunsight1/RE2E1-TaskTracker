package org.TaskTracker.domain.task;

import org.TaskTracker.interfaces.task.TaskDto;

import java.util.List;

public interface TaskReader {
    List<TaskDto> getTasks();
}
