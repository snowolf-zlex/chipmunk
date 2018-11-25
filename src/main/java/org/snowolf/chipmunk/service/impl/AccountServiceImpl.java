/**
 *
 */
package org.snowolf.chipmunk.service.impl;

import javax.annotation.Resource;
import org.snowolf.chipmunk.dao.AccountDao;
import org.snowolf.chipmunk.domain.Account;
import org.snowolf.chipmunk.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author snowolf
 */
@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    /*
     * (non-Javadoc)
     *
     * @see org.snowolf.smart.finance.service.AccountService#readById(long)
     */
    @Override
    public Account readById(long id) {
        return accountDao.read(id);
    }
}
