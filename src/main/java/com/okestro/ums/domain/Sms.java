package com.okestro.ums.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Sms extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "sms_id")
    private Long id;
    private String destPhoneNumber;
    private String msg;
    private String title;

    protected Sms(String destPhoneNumber, String msg, String title,String userId,String userName){
        super(userId,userName);
        this.destPhoneNumber = destPhoneNumber;
        this.msg = msg;
        this.title = title;
    }



    public static Sms createSms(String destPhoneNumber, String msg, String title,String userId,String userName){
        Sms sms = new Sms(destPhoneNumber,msg,title,userId,userName);
        return sms;
    }

}
