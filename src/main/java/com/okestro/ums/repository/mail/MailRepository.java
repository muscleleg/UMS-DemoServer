package com.okestro.ums.repository.mail;

import com.okestro.ums.domain.Hub;
import com.okestro.ums.domain.Mail;
import com.okestro.ums.domain.User;
import com.okestro.ums.repository.hub.HubRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MailRepository extends JpaRepository<Mail,Long>, MailRepositoryCustom {
}
