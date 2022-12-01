package com.okestro.ums.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Hub extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "hub_id")
    private Long id;
    private String msg;
    private String title;

    protected Hub(String msg, String title, String userId, String userName) {
        super(userId,userName);
        this.msg = msg;
        this.title = title;
    }

    public static Hub createHub(String msg, String title, String userId, String userName) {
        Hub hub = new Hub(msg, title, userId, userName);
        return hub;
    }
}
