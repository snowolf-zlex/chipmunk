/**
 *
 */
package org.snowolf.chipmunk.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.snowolf.chipmunk.domain.LoanPlan;

/**
 * @author snowolf
 */
@Mapper
public interface LoanPlanDao {

    /**
     *
     */
    public void create(LoanPlan loanPlan);

    /**
     *
     */
    public LoanPlan read(long id);

    /**
     *
     */
    public List<LoanPlan> readAll();

    /**
     *
     */
    public void update(LoanPlan loanPlan);

    /**
     *
     */
    public void delete(long id);
}
