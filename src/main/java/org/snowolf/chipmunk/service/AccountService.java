/**
 *
 */
package org.snowolf.chipmunk.service;

import org.snowolf.chipmunk.domain.Account;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

/**
 * @author snowolf
 */
@Component
@EnableAutoConfiguration
public interface AccountService {

    Account readById(long id);
}
