/**
 * 
 */
package org.snowolf.chipmunk.service;

import java.util.List;

import org.snowolf.chipmunk.domain.LoanDetail;
import org.snowolf.chipmunk.domain.LoanPlan;
import org.snowolf.chipmunk.domain.LoanType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

/**
 * @author Snowolf
 *
 */
@Component
@EnableAutoConfiguration
public interface LoanService {
	/**
	 * 获取所有贷款计划说明
	 * 
	 * @return
	 */
	public List<LoanPlan> listAllLoanPlans();

	/**
	 * 获取所有贷款类型
	 * 
	 * @return
	 */
	public List<LoanType> listAllLoanTypes();

	/**
	 * 获取指定类型下的贷款计划
	 * 
	 * @param typeId
	 * @return
	 */
	public List<LoanPlan> listAllLoanPlans(long typeId);

	/**
	 * 获取指定计划下的全部贷款详情
	 * 
	 * @param planId
	 */
	public List<LoanDetail> listAllLoanDetailsByPlanId(long planId);

	/**
	 * @param id
	 * @return
	 */
	public LoanPlan getLoanPlan(long id);

	/**
	 * 更新贷款计划
	 * 
	 * @param loanPlan
	 */
	public void updateLoanPlan(LoanPlan loanPlan);

	/**
	 * @param loanType
	 */
	public void updateLoanType(LoanType loanType);

	/**
	 * @param id
	 * @return
	 */
	public LoanType getLoanType(long id);

	/**
	 * @param id
	 */
	public void deleteLoanType(long id);

	public LoanType createLoanType(LoanType loanType);
}
