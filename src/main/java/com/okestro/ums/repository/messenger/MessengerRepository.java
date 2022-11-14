package com.okestro.ums.repository.messenger;

import com.okestro.ums.domain.Messenger;
import com.okestro.ums.domain.User;
import com.okestro.ums.repository.user.UserRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessengerRepository extends JpaRepository<Messenger,Long>, UserRepositoryCustom {
//    List<Messenger> findByUserName(String userName);
}
