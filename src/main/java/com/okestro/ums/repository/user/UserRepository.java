package com.okestro.ums.repository.user;

import com.okestro.ums.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long>, UserRepositoryCustom {
    User findByUserId(String userId);
    User findByUserIdAndUserName(String userId,String userName);
}
