/**
 * 
 */
package org.snowolf.chipmunk.service.impl;

import org.snowolf.chipmunk.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author snowolf
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.snowolf.chipmunk.service.UserService#changePassword(long,
	 * java.lang.String)
	 */
	@Override
	public void changePassword(long id, String password) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.snowolf.chipmunk.service.UserService#checkPassword(long,
	 * java.lang.String)
	 */
	@Override
	public boolean checkPassword(long id, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.snowolf.chipmunk.service.UserService#changePassword(long,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public boolean changePassword(long id, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

}
