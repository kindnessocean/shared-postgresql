package org.dapamoha.shared.posgresql.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.dapamoha.shared.domain.dto.user.UserPrivateProfileDto;
import org.dapamoha.shared.posgresql.entity.User;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConverterSqlEntityToDtoUtil {

    //    public static PrivateUserDto convert(User user){
    //        return new PrivateUserDto(
    //                user.getEmail(),
    //                user.getUsername(),
    //                user.getFirstName(),
    //                user.getLastName()
    //        );
    //    }

    public static UserPrivateProfileDto convert(User user) {
        return UserPrivateProfileDto
                .builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }
}