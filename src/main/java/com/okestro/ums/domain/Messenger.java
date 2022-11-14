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
//    private String msg;
//    private String title;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    protected Messenger() {
    }

    public static Messenger createMessenger(String msg, String title, User user){
        Messenger messenger = new Messenger();
        messenger.setMsg(msg);
        messenger.setTitle(title);
        messenger.user = user;
        return messenger;
    }
}
