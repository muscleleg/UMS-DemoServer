package com.okestro.ums.service;

import com.okestro.ums.domain.Messenger;
import com.okestro.ums.repository.messenger.MessengerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MessengerService {
    private final MessengerRepository messengerRepository;
    public Messenger save(Messenger messenger){
        return messengerRepository.save(messenger);
    }
}
