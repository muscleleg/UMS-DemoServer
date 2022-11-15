package com.okestro.ums.repository.user;

import com.okestro.ums.domain.User;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {
    private final EntityManager em;
}
