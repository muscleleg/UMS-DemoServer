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
    protected Hub(String msg,String title,User user){
        this.setMsg(msg);
        this.setTitle(title);
        this.user = user;
    }

    public static Hub createHub(String msg, String title,User user){
        Hub hub = new Hub(msg,title,user);
        return hub;
    }
}
