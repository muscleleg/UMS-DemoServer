package com.okestro.ums.domain;

import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Setter
public abstract class BaseEntity {
    private String msg;
    private String title;
}
