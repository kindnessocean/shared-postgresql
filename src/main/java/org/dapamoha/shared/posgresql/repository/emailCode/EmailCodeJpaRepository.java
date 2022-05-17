package org.dapamoha.shared.posgresql.repository.emailCode;

import org.dapamoha.shared.posgresql.entity.EmailCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EmailCodeJpaRepository extends JpaRepository<EmailCode, Long> {

}
