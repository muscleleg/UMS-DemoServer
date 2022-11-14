package com.okestro.ums.domain;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Long id;
    private String userName;
    private String userId;

    protected User() {
    }

    public static User createUser(String userId, String userName) {
        User user = new User();
        user.userId = userId;
        user.userName = userName;
        return user;
    }
}
