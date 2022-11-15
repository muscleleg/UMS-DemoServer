package com.okestro.ums.service;

import com.okestro.ums.domain.Sms;
import com.okestro.ums.domain.User;
import com.okestro.ums.repository.sms.SmsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class SmsService {
    private final SmsRepository smsRepository;
    public Sms save(Sms sms){
        return smsRepository.save(sms);
    }
}
