package com.okestro.ums.repository.sms;

import com.okestro.ums.domain.Hub;
import com.okestro.ums.domain.Sms;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
public class SmsRepositoryImpl implements SmsRepositoryCustom {
    private final EntityManager em;

    @Override
    public Sms save(Sms sms) {
        em.persist(sms);
        return sms;
    }
}
