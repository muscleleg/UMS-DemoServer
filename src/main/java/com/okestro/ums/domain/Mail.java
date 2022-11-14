package com.okestro.ums.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Mail {
    @Id
    @GeneratedValue
    @Column(name = "mail_id")
    private Long id;
    private String address;
    private String content;
    private String title;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    protected Mail() {
    }

    public static Mail createMail(String address, String content, String title, User user) {
        Mail mail = new Mail();
        mail.address = address;
        mail.content = content;
        mail.user = user;
        return mail;
    }
}

