package com.okestro.ums.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Mail extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mail_id")
    private Long id;
    private String address;
    private String content;
    private String title;


    protected Mail(String address, String content, String title,String userId,String userName) {
        super(userId,userName);
        this.address = address;
        this.content = content;
        this.title = title;
    }

    public static Mail createMail(String address, String content, String title,String userId,String userName) {
        Mail mail = new Mail(address,content,title,userId,userName);
        return mail;
    }
}

