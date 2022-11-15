package com.okestro.ums.service;

import com.okestro.ums.domain.Mail;
import com.okestro.ums.repository.mail.MailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MailService {
    private final MailRepository mailRepository;
    public Mail save(Mail mail){
        return mailRepository.save(mail);
    }
}
