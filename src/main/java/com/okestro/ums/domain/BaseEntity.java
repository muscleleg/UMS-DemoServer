package com.okestro.ums.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity {
    private String userId;
    private String userName;

//    public BaseEntity() {
//    }
//
//    public BaseEntity(String userId, String userName) {
//        this.userId = userId;
//        this.userName = userName;
//    }
}
