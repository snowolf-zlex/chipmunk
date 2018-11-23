/**
 * 
 */
package org.snowolf.chipmunk.dao;

import org.apache.ibatis.annotations.Mapper;
import org.snowolf.chipmunk.domain.Account;

/**
 * @author snowolf
 *
 */
@Mapper
public interface AccountDao {
	/**
	 * @param id
	 * @return
	 */
	public Account read(long id);

	/**
	 * @param account
	 */
	public void update(Account account);

	/**
	 * @param account
	 */
	public void create(Account account);

	/**
	 * @param id
	 */
	public void delete(long id);

}
