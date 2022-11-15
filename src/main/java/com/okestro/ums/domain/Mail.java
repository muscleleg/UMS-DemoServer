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


    protected Mail() {
    }

    private Mail(String address, String content, String title) {
        this.address = address;
        this.content = content;
        this.title = title;
    }

    public static Mail createMail(String address, String content, String title) {
        Mail mail = new Mail(address,content,title);
        return mail;
    }
}

