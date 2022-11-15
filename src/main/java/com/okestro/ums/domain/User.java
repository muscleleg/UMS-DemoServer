package com.okestro.ums.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name="users_id")
    private Long id;
    @NotBlank
    private String userName;
    @NotBlank
    @Column(unique = true)
    private String userId;
    protected User() {
    }

    protected User(String userName,String userId) {
        this.userName = userName;
        this.userId = userId;
    }

    public static User createUser(String userName,String userId) {
        User user = new User(userName,userId);
        return user;
    }
}
