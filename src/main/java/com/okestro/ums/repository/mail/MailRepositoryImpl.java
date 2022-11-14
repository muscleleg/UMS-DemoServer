package com.okestro.ums.repository.mail;

import com.okestro.ums.domain.Mail;
import com.okestro.ums.domain.User;
import com.okestro.ums.repository.user.UserRepositoryCustom;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
public class MailRepositoryImpl implements MailRepositoryCustom {
    private final EntityManager em;

    @Override
    public Mail save(Mail mail) {
        em.persist(mail);
        return mail;
    }
}
