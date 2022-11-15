package com.okestro.ums.repository.sms;

import com.okestro.ums.domain.Sms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmsRepository extends JpaRepository<Sms,Long>, SmsRepositoryCustom {
}
