package com.okestro.ums.repository.mail;

import com.okestro.ums.domain.User;
import com.okestro.ums.repository.user.UserRepositoryCustom;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
public class MailRepositoryImpl implements UserRepositoryCustom {
    private final EntityManager em;

    @Override
    public User save(User user) {
        em.persist(user);
        return user;
    }
}
