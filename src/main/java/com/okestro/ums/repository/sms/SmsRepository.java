package com.okestro.ums.repository.sms;

import com.okestro.ums.domain.Hub;
import com.okestro.ums.domain.Sms;
import com.okestro.ums.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SmsRepository extends JpaRepository<Sms,Long>, SmsRepositoryCustom {
}
