package org.dapamoha.shared.posgresql.repository.emailCode;

import org.dapamoha.shared.posgresql.entity.EmailCode;

public interface EmailCodeRepository {
    EmailCode update(EmailCode emailCode);

    EmailCode save(EmailCode emailCode);

    long count();
}
