package com.okestro.ums.repository.messenger;

import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
public class MessengerRepositoryImpl implements MessengerRepositoryCustom {
    private final EntityManager em;


}
