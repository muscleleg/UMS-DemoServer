package com.okestro.ums.repository.hub;

import com.okestro.ums.domain.Hub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HubRepository extends JpaRepository<Hub,Long>, HubRepositoryCustom {
}
