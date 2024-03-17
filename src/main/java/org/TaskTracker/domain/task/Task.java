package org.TaskTracker.domain.task;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.TaskTracker.domain.AbstractEntity;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Task extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String content;
    private boolean finished;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
