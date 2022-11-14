package com.okestro.ums.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Hub extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name="hub_id")
    private Long id;
//    private String msg;
//    private String title;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    protected Hub() {
    }

    public static Hub createHub(String msg, String title){
        Hub hub = new Hub();
        hub.setMsg(msg);
        hub.setTitle(title);
        return hub;
    }
}
