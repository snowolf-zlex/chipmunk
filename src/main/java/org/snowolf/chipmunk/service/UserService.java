/**
 * 
 */
package org.snowolf.chipmunk.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

/**
 * @author snowolf
 *
 */
@Component
@EnableAutoConfiguration
public interface UserService extends UserDetailsService {

	/**
	 * @param id
	 * @param password
	 * @return
	 */
	public void changePassword(long id, String password);

	/**
	 * @param id
	 * @param password
	 * @return
	 */
	public boolean checkPassword(long id, String password);

	/**
	 * @param id
	 * @param oldPassword
	 * @param newPassword
	 * @return
	 */
	public boolean changePassword(long id, String oldPassword, String newPassword);
}
