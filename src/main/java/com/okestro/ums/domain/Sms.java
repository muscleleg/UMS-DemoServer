package com.okestro.ums.domain;

import javax.persistence.*;

@Entity
public class Sms extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "sms_id")
    private Long id;
    private String destPhoneNumber;
    private String msg;
    private String title;
    protected Sms() {
    }
    private Sms(String destPhoneNumber, String msg, String title,String userId,String userName){
        this.destPhoneNumber = destPhoneNumber;
        this.msg = msg;
        this.title = title;
        this.setUserId(userId);
        this.setUserName(userName);
    }
    public static Sms createSms(String destPhoneNumber, String msg, String title,String userId,String userName){
        Sms sms = new Sms(destPhoneNumber,msg,title,userId,userName);
        return sms;
    }

}
