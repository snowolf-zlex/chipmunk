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
 */
@Component
@EnableAutoConfiguration
public interface LoanService {

    /**
     * 获取所有贷款计划说明
     */
    List<LoanPlan> listAllLoanPlans();

    /**
     * 获取所有贷款类型
     */
    List<LoanType> listAllLoanTypes();

    /**
     * 获取指定类型下的贷款计划
     */
    List<LoanPlan> listAllLoanPlans(long typeId);

    /**
     * 获取指定计划下的全部贷款详情
     */
    List<LoanDetail> listAllLoanDetailsByPlanId(long planId);

    /**
     *
     */
    LoanPlan getLoanPlan(long id);

    /**
     * 更新贷款计划
     */
    void updateLoanPlan(LoanPlan loanPlan);

    /**
     *
     */
    void updateLoanType(LoanType loanType);

    /**
     *
     */
    LoanType getLoanType(long id);

    /**
     *
     */
    void deleteLoanType(long id);

    LoanType createLoanType(LoanType loanType);
}
