package com.okestro.ums.repository.messenger;

import com.okestro.ums.domain.User;
import com.okestro.ums.repository.user.UserRepositoryCustom;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
public class MessengerRepositoryImpl implements UserRepositoryCustom {
    private final EntityManager em;

    @Override
    public User save(User user) {
        em.persist(user);
        return user;
    }
}
