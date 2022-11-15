package com.okestro.ums.service;

import com.okestro.ums.domain.User;
import com.okestro.ums.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
    private final UserRepository userRepository;
    public User join(User user){
        return userRepository.save(user);
    }
    public User findByUserId(String userId){
        return userRepository.findByUserId(userId);
    }
    public User findByUserIdAndUserName(String userId, String userName){
        return userRepository.findByUserIdAndUserName(userId,userName);
    }
}
