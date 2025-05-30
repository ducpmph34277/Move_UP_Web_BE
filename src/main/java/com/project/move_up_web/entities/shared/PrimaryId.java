package com.project.move_up_web.entities.shared;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class PrimaryId extends BaseEntities{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
