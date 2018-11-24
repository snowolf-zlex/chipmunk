/**
 *
 */
package org.snowolf.chipmunk.service.impl;

import java.util.List;
import org.snowolf.chipmunk.dao.RoleDao;
import org.snowolf.chipmunk.dao.UserDao;
import org.snowolf.chipmunk.domain.Role;
import org.snowolf.chipmunk.domain.User;
import org.snowolf.chipmunk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

/**
 * @author Snowolf
 */
@Service("userDetailsService")
@Transactional
public class UserServiceImpl implements UserService, UserDetailsService {

  @Autowired
  private UserDao userDao;

  @Autowired
  private RoleDao roleDao;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    User user = userDao.readByUsername(username);

    if (user == null) {
      throw new UsernameNotFoundException(username);
    }
    List<Role> roleList = roleDao.readListByUsernameWithAllEnabledRoles(username);

    user.setRoleList(roleList);
    if (CollectionUtils.isEmpty(user.getRoleList())) {
      return user;
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
  public void changePassword(User user) {
    user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
    userDao.updatePassword(user);
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
