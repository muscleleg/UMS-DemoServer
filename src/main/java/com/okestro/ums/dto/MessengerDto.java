package com.okestro.ums.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class MessengerDto {
    private String msg;
    private String title;
    @NotBlank
    private String userId;
    @NotBlank
    private String userName;
}
