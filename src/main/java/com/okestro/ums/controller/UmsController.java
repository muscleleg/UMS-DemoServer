package com.okestro.ums.controller;

import com.okestro.ums.domain.*;
import com.okestro.ums.dto.*;
import com.okestro.ums.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class UmsController {
    private final HubService hubService;
    private final MessengerService messengerService;
    private final MailService mailService;
    private final SmsService smsService;
    @PostMapping("/api/hub")
    public ResponseEntity<ResponseDto> sendHub(@Valid HubDto hubDto, BindingResult bindingResult){
        if(!bindingResult.hasErrors()){
            Hub hub = Hub.createHub(hubDto.getMsg(), hubDto.getTitle(),hubDto.getUserId(),hubDto.getUserName());
            hubService.saveHub(hub);
            return ResponseDto.createResponseEntity(true,hubDto);
        }
        return ResponseDto.createResponseEntity(false,hubDto);
    }
    @PostMapping("/api/messenger")
    public ResponseEntity<ResponseDto> sendMessenger(@Valid MessengerDto messengerDto, BindingResult bindingResult){
        if(!bindingResult.hasErrors()){
            Messenger messenger = Messenger.createMessenger(messengerDto.getMsg(), messengerDto.getTitle(), messengerDto.getUserId(), messengerDto.getUserName());
            messengerService.save(messenger);
            return ResponseDto.createResponseEntity(true,messengerDto);
        }
        return ResponseDto.createResponseEntity(false,messengerDto);
    }
    @PostMapping("/api/mail")
    public ResponseEntity<ResponseDto> sendMail(@Valid MailDto mailDto, BindingResult bindingResult){
        if(!bindingResult.hasErrors()){
            Mail mail = Mail.createMail(mailDto.getAddress(), mailDto.getContents(), mailDto.getTitle(), mailDto.getUserId(),mailDto.getUserName());
            mailService.save(mail);
            return ResponseDto.createResponseEntity(true,mailDto);
        }
        return ResponseDto.createResponseEntity(false,mailDto);
    }
    @PostMapping("/api/sms")
    public ResponseEntity<ResponseDto> sendMail(@Valid SmsDto smsDto, BindingResult bindingResult){
        if(!bindingResult.hasErrors()){
            Sms sms = Sms.createSms(smsDto.getDestPhoneNumber(),smsDto.getMsg(),smsDto.getTitle(),smsDto.getUserId(), smsDto.getUserName());
            smsService.save(sms);
            return ResponseDto.createResponseEntity(true,smsDto);
        }
        return ResponseDto.createResponseEntity(false,smsDto);
    }
}
