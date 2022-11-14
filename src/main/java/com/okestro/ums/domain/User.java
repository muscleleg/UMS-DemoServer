package com.okestro.ums.domain;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Long id;
    private String userName;

    protected User() {
    }

    public static User createUser(String userName) {
        User user = new User();
        user.userName = userName;
        return user;
    }
}
