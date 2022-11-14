package com.okestro.ums.domain;

import javax.persistence.*;

@Entity
public class Sms {
    @Id
    @GeneratedValue
    @Column(name = "sms_id")
    private Long id;
    private String destPhoneNumber;
    private String msg;
    private String title;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    protected Sms() {
    }

    public static Sms createSms(String destPhoneNumber, String msg, String title,User user){
        Sms sms = new Sms();
        sms.destPhoneNumber = destPhoneNumber;
        sms.msg = msg;
        sms.title = sms.title;
        sms.user = user;
        return sms;
    }

}
