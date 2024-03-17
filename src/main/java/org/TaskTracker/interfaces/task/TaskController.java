package org.TaskTracker.interfaces.task;

import lombok.RequiredArgsConstructor;
import org.TaskTracker.application.task.TaskFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/task")
public class TaskController {
    private final TaskFacade taskFacade;

    @GetMapping("")
    public List<TaskDto> getTasks(@RequestBody TaskDto taskDto){
    //TODO COMMON RESPONSE 생성 후 상속받아 TASK RESPONSE 구현
        return taskFacade.getTasks();
    }
}
