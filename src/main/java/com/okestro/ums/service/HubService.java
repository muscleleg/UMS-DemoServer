package com.okestro.ums.service;

import com.okestro.ums.domain.Hub;
import com.okestro.ums.repository.hub.HubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class HubService {
    private final HubRepository hubRepository;
    public Hub saveHub(Hub hub){
        return hubRepository.save(hub);
    }
}
