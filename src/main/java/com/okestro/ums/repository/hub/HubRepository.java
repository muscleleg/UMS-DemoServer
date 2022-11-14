package com.okestro.ums.repository.hub;

import com.okestro.ums.domain.Hub;
import com.okestro.ums.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HubRepository extends JpaRepository<Hub,Long>, HubRepositoryCustom {
//    List<Hub> findByUserName(String userName);
}
