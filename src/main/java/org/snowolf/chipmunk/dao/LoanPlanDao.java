/**
 * 
 */
package org.snowolf.chipmunk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.snowolf.chipmunk.domain.LoanPlan;

/**
 * @author snowolf
 *
 */
@Mapper
public interface LoanPlanDao {

	/**
	 * @param loanPlan
	 */
	public void create(LoanPlan loanPlan);

	/**
	 * @param id
	 * @return
	 */
	public LoanPlan read(long id);

	/**
	 * @return
	 */
	public List<LoanPlan> readAll();

	/**
	 * @param loanPlan
	 */
	public void update(LoanPlan loanPlan);

	/**
	 * @param id
	 */
	public void delete(long id);

}
