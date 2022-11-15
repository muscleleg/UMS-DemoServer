package com.okestro.ums.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Mail extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "mail_id")
    private Long id;
    private String address;
    private String content;
    private String title;
    protected Mail() {
    }

    private Mail(String address, String content, String title,String userId,String userName) {
        this.address = address;
        this.content = content;
        this.title = title;
        this.setUserId(userId);
        this.setUserName(userName);
    }

    public static Mail createMail(String address, String content, String title,String userId,String userName) {
        Mail mail = new Mail(address,content,title,userId,userName);
        return mail;
    }
}

