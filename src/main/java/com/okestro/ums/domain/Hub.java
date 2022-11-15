package com.okestro.ums.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Hub extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "hub_id")
    private Long id;
    private String msg;
    private String title;
    protected Hub() {
    }

    protected Hub(String msg, String title, String userId, String userName) {
        this.msg = msg;
        this.title = title;
        this.setUserId(userId);
        this.setUserName(userName);
    }

    public static Hub createHub(String msg, String title, String userId, String userName) {
        Hub hub = new Hub(msg, title, userId, userName);
        return hub;
    }
}
