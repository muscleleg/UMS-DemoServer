package com.okestro.ums.domain;

import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Setter
public class BaseEntity {
    private String msg;
    private String title;
}
