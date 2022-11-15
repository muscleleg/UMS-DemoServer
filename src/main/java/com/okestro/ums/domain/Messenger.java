package com.okestro.ums.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Messenger extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name="messenger_id")
    private Long id;



    protected Messenger() {
    }
    private Messenger(String msg,String title, String userId,String userName){
        this.setMsg(msg);
        this.setTitle(title);
        this.setUserId(userId);
        this.setUserName(userName);
    }


    public static Messenger createMessenger(String msg,String title, String userId,String userName){
        Messenger messenger = new Messenger(msg,title,userId,userName);
        return messenger;
    }
}
