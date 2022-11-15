package com.okestro.ums.repository.messenger;

import com.okestro.ums.domain.Messenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessengerRepository extends JpaRepository<Messenger,Long>, MessengerRepositoryCustom {
}
