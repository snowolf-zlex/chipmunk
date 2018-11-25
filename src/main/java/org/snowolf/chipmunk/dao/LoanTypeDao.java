/**
 *
 */
package org.snowolf.chipmunk.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.snowolf.chipmunk.domain.LoanType;

/**
 * @author snowolf
 */
@Mapper
public interface LoanTypeDao {

    /**
     *
     */
    public void create(LoanType loanType);

    /**
     *
     */
    public LoanType read(long id);

    /**
     *
     */
    public void update(LoanType loanType);

    /**
     *
     */
    public void delete(long id);

    /**
     *
     */
    public List<LoanType> readAll();
}
