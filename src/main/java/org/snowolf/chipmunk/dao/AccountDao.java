/**
 *
 */
package org.snowolf.chipmunk.dao;

import org.apache.ibatis.annotations.Mapper;
import org.snowolf.chipmunk.domain.Account;

/**
 * @author snowolf
 */
@Mapper
public interface AccountDao {

    /**
     *
     */
    public Account read(long id);

    /**
     *
     */
    public void update(Account account);

    /**
     *
     */
    public void create(Account account);

    /**
     *
     */
    public void delete(long id);
}
