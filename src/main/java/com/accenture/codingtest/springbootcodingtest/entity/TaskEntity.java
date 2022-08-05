package com.accenture.codingtest.springbootcodingtest.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Builder
@Table(name="TASK")
public class TaskEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = true)
    private String description;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private UUID project_id;

    @Column(nullable = false)
    private UUID user_id;
}
