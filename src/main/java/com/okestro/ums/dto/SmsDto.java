package com.okestro.ums.dto;

import lombok.Data;

@Data
public class SmsDto {
    private String destPhoneNumber;
    private String msg;
    private String title;
    private String userId;
    private String userName;
}
