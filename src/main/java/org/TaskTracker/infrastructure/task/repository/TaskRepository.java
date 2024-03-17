package org.TaskTracker.infrastructure.task.repository;

import jakarta.persistence.Id;
import org.TaskTracker.domain.task.Task;
import org.TaskTracker.interfaces.task.TaskDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Id> {
    //TODO Querydsl, mybatis 의존성 추가 후 ORM INTERFACE 다양화
    List<TaskDto> findAllById();
}
