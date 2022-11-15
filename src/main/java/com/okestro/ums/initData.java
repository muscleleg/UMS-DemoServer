package com.okestro.ums;

import com.okestro.ums.domain.*;
import com.okestro.ums.repository.hub.HubRepository;
import com.okestro.ums.repository.mail.MailRepository;
import com.okestro.ums.repository.messenger.MessengerRepository;
import com.okestro.ums.repository.sms.SmsRepository;
import com.okestro.ums.repository.user.UserRepository;
import com.okestro.ums.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@Component
public class initData {
    private final HubService hubService;
    private final HubRepository hubRepository;
    private final MailService mailService;
    private final MailRepository mailRepository;
    private final MessengerService messengerService;
    private final MessengerRepository messengerRepository;
    private final SmsService smsService;
    private final SmsRepository smsRepository;
    private final UserService userService;
    private final UserRepository userRepository;

    @PostConstruct
    public void initData() {
        User user = User.createUser("홍길동", "okestro");
        User savedUser = userService.join(user);

        Hub hub = Hub.createHub("hub message", "hub title", savedUser);
        hubService.saveHub(hub);

        Mail mail = Mail.createMail("testmail@gmail.com","Mail content","Mail title",savedUser);
        mailService.save(mail);

        Messenger messenger = Messenger.createMessenger("Messenger msg","Messenger title",savedUser);
        messengerService.save(messenger);

        Sms sms = Sms.createSms("010-1234-9862","SMS msg","SMS title",savedUser);
        smsService.save(sms);

    }


}