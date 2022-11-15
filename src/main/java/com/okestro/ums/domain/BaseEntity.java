package com.okestro.ums.domain;

import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
@Setter
public abstract class BaseEntity {
    private String userId;
    private String userName;
}
