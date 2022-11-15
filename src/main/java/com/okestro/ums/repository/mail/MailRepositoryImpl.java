package com.okestro.ums.repository.mail;

import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
public class MailRepositoryImpl implements MailRepositoryCustom {
    private final EntityManager em;


}
