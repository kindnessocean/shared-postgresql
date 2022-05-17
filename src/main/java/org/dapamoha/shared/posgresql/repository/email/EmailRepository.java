package org.dapamoha.shared.posgresql.repository.email;

import org.dapamoha.shared.posgresql.entity.Email;

public interface EmailRepository {
    Email getEmailByAddress(String address);

    Email update(Email email);

    Email create(Email email);

    long count();

    boolean isExistEmailByAddress(String address);
}
