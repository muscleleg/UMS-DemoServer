package com.okestro.ums.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class MailDto {

    private String address;
    @NotBlank
    private String contents;
    @NotBlank
    private String title;
    @NotBlank
    private String userId;
    @NotBlank
    private String userName;

}
