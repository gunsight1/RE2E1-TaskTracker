package org.TaskTracker.interfaces.task;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskDto {

    private Long id;
    private String content;
    private boolean finished;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
