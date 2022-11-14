package com.okestro.ums.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Messenger {
    @Id
    @GeneratedValue
    @Column(name="messenger_id")
    private Long id;
    private String msg;
    private String title;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    protected Messenger() {
    }

    public static Messenger createMessenger(String msg, String title, User user){
        Messenger messenger = new Messenger();
        messenger.msg = msg;
        messenger.title = title;
        messenger.user = user;
        return messenger;
    }
}
