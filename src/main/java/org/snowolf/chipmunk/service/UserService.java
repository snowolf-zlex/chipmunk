/**
 *
 */
package org.snowolf.chipmunk.service;

import org.snowolf.chipmunk.domain.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

/**
 * @author Snowolf
 */
@Component
@EnableAutoConfiguration
public interface UserService extends UserDetailsService {

    /**
     *
     */
    void changePassword(User user);

    /**
     *
     */
    boolean changePassword(long id, String oldPassword, String newPassword);
}
