package com.okestro.ums.repository.mail;

import com.okestro.ums.domain.Mail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepository extends JpaRepository<Mail,Long>, MailRepositoryCustom {
}
