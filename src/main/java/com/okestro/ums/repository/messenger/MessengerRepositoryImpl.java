package com.okestro.ums.repository.messenger;

import com.okestro.ums.domain.Messenger;
import com.okestro.ums.domain.User;
import com.okestro.ums.repository.user.UserRepositoryCustom;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
public class MessengerRepositoryImpl implements MessengerRepositoryCustom {
    private final EntityManager em;


}
