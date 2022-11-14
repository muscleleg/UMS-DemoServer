package com.okestro.ums.repository.hub;

import com.okestro.ums.domain.Hub;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
public class HubRepositoryImpl implements HubRepositoryCustom{
    private final EntityManager em;

    @Override
    public Hub save(Hub hub) {
        em.persist(hub);
        return hub;
    }
}
