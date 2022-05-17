package org.dapamoha.shared.posgresql.repository.user;


import org.dapamoha.shared.posgresql.entity.User;

public interface UserRepository {

    User save(User user);

    User getUserByUsername(String username);

    Boolean isExistUserByUsername(String username);

    long count();
}
