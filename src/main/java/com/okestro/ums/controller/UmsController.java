package com.okestro.ums.controller;

import com.okestro.ums.domain.*;
import com.okestro.ums.dto.*;
import com.okestro.ums.service.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Slf4j
@RequiredArgsConstructor
@RestController
public class UmsController {
    private final HubService hubService;
    private final MessengerService messengerService;
    private final MailService mailService;
    private final SmsService smsService;
    //nested object쓸때 유용할듯
//    @Data
//    static class HubDto {
//        private String msg;
//        private String title;
//        @NotBlank
//        private User user;
//        @NotBlank
//        private String userName;
//    }
    @PostMapping("/api/hub")
    public ResponseEntity<ResponseDto> sendHub(@RequestBody @Valid HubDto hubDto, BindingResult bindingResult, HttpServletRequest httpServletRequest){
        ResponseEntity<ResponseDto> responseEntity ;
        
        if (bindingResult.hasFieldErrors()) {
            bindingResult.getFieldErrors().forEach(error -> log.info("URI : {}, {}의 {}는 {}", httpServletRequest.getRequestURI(), error.getObjectName(), error.getField(), error.getDefaultMessage()));
            ResponseDto responseDto = ResponseDto.createResponseEntity(false, hubDto);
            responseEntity = ResponseEntity.badRequest().body(responseDto);
        } else {
            Hub hub = Hub.createHub(hubDto.getMsg(), hubDto.getTitle(), hubDto.getUserId(), hubDto.getUserName());
            hubService.saveHub(hub);
            ResponseDto responseDto = ResponseDto.createResponseEntity(true, hubDto);
            responseEntity = ResponseEntity.ok().body(responseDto);
        }
        return responseEntity;
    }

    @PostMapping("/api/messenger")
    public ResponseEntity<ResponseDto> sendMessenger(@RequestBody @Valid MessengerDto messengerDto, BindingResult bindingResult,HttpServletRequest httpServletRequest) {
        ResponseEntity<ResponseDto> responseEntity;

        if (bindingResult.hasErrors()) {
            for (FieldError error : bindingResult.getFieldErrors()) {
                log.info("URI : {}, {}의 {}는 {}", httpServletRequest.getRequestURI(),error.getObjectName(),error.getField(),error.getDefaultMessage());
            }
            ResponseDto responseDto = ResponseDto.createResponseEntity(false, messengerDto);
            responseEntity = ResponseEntity.badRequest().body(responseDto);
        } else {
            Messenger messenger = Messenger.createMessenger(messengerDto.getMsg(), messengerDto.getTitle(), messengerDto.getUserId(), messengerDto.getUserName());
            messengerService.save(messenger);
            ResponseDto responseDto = ResponseDto.createResponseEntity(true, messengerDto);
            responseEntity = ResponseEntity.ok().body(responseDto);
        }
        return responseEntity;
    }

    @PostMapping("/api/mail")
    public ResponseEntity<ResponseDto> sendMail(@RequestBody @Valid MailDto mailDto, BindingResult bindingResult,HttpServletRequest httpServletRequest) {
        ResponseEntity<ResponseDto> responseEntity;
        if (bindingResult.hasErrors()) {
            for (FieldError error : bindingResult.getFieldErrors()) {
                log.info("URI : {}, {}의 {}는 {}", httpServletRequest.getRequestURI(),error.getObjectName(),error.getField(),error.getDefaultMessage());
            }
            ResponseDto responseDto = ResponseDto.createResponseEntity(false, mailDto);
            responseEntity = ResponseEntity.badRequest().body(responseDto);
        } else {
            Mail mail = Mail.createMail(mailDto.getAddress(), mailDto.getContents(), mailDto.getTitle(), mailDto.getUserId(), mailDto.getUserName());
            mailService.save(mail);
            ResponseDto responseDto = ResponseDto.createResponseEntity(true, mailDto);
            responseEntity = ResponseEntity.ok().body(responseDto);
        }
        return responseEntity;
    }

    @PostMapping("/api/sms")
    public ResponseEntity<ResponseDto> sendMail(@RequestBody @Valid SmsDto smsDto, BindingResult bindingResult,HttpServletRequest httpServletRequest) {
        ResponseEntity<ResponseDto> responseEntity;
        if (bindingResult.hasErrors()) {
            for (FieldError error : bindingResult.getFieldErrors()) {
                log.info("URI : {}, {}의 {}는 {}", httpServletRequest.getRequestURI(),error.getObjectName(),error.getField(),error.getDefaultMessage());
            }
            ResponseDto responseDto = ResponseDto.createResponseEntity(false, smsDto);
            responseEntity = ResponseEntity.badRequest().body(responseDto);
        } else {
            Sms sms = Sms.createSms(smsDto.getDestPhoneNumber(), smsDto.getMsg(), smsDto.getTitle(), smsDto.getUserId(), smsDto.getUserName());
            smsService.save(sms);
            ResponseDto responseDto = ResponseDto.createResponseEntity(true, sms);
            responseEntity = ResponseEntity.ok().body(responseDto);
        }

        return responseEntity;
    }
}
