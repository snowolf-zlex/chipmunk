/**
 * 
 */
package org.snowolf.chipmunk.service.impl;

import org.snowolf.chipmunk.dao.UserDao;
import org.snowolf.chipmunk.domain.User;
import org.snowolf.chipmunk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Snowolf
 *
 */
@Service("userDetailsService")
@Transactional
public class UserServiceImpl implements UserService, UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userDao.readByUsername(username);

		if( user == null ){
			throw new UsernameNotFoundException(String.format("User with username=%s was not found", username));
		}

		return user;
	}

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
