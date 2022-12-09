package com.okestro.ums.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Messenger extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="messenger_id")
    private Long id;
    private String msg;
    private String title;

    protected Messenger(String msg,String title, String userId,String userName){
        super(userId,userName);
        this.msg = msg;
        this.title = title;

    }


    public static Messenger createMessenger(String msg,String title, String userId,String userName){
        Messenger messenger = new Messenger(msg,title,userId,userName);
        return messenger;
    }
}
