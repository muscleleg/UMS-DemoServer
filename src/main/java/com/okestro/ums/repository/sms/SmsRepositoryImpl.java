package com.okestro.ums.repository.sms;

import com.okestro.ums.domain.Hub;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
public class SmsRepositoryImpl implements SmsRepositoryCustom {
    private final EntityManager em;

    @Override
    public Hub save(Hub hub) {
        em.persist(hub);
        return hub;
    }
}
