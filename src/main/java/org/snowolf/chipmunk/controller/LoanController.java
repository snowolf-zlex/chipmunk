/**
 * 
 */
package org.snowolf.chipmunk.controller;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.snowolf.chipmunk.domain.LoanDetail;
import org.snowolf.chipmunk.domain.LoanPlan;
import org.snowolf.chipmunk.domain.LoanType;
import org.snowolf.chipmunk.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Snowolf
 *
 */
@RestController
@RequestMapping(value = "/loan")
public class LoanController {

	@Autowired
	private LoanService loanService;

	/**
	 * 获取指定的贷款计划
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getLoanPlan")
	public LoanPlan getLoanPlan(@RequestParam long id) {
		LoanPlan loanPlan = loanService.getLoanPlan(id);

		return loanPlan;
	}

	/**
	 * 获取所有贷款计划
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getAllLoanPlans")
	public List<LoanPlan> getLoanPlans() {
		List<LoanPlan> loanPlanList = loanService.listAllLoanPlans();

		return loanPlanList;

	}

	/**
	 * 获得全部贷款类型
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getAllLoanTypes")
	public List<LoanType> getLoanTypes() {
		List<LoanType> loanTypeList = loanService.listAllLoanTypes();
		return loanTypeList;
	}

	/**
	 * 获得贷款计划详情
	 * 
	 * 
	 * @param planId
	 * @return
	 */
//	@RequestParam(value = "typeId", required = false) long typeId
	@RequestMapping(value = "/getLoanPlanDetails")
	public List<LoanDetail> getLoanPlanDetails(@RequestParam long planId) {
		List<LoanDetail> list = loanService.listAllLoanDetailsByPlanId(planId);

		return list;
	}

	@NotNull
	@PostMapping(value = "/updateLoanPlan")
	public LoanPlan updateLoanPlan(@RequestBody LoanPlan loanPlan) {
		if (loanPlan != null) {
			loanService.updateLoanPlan(loanPlan);
			return loanService.getLoanPlan(loanPlan.getId());
		}
		return null;
	}

	@NotNull
	@PostMapping(value = "/updateLoanType")
	public LoanType updateLoanType(@RequestBody LoanType loanType) {
		if (loanType != null) {
			loanService.updateLoanType(loanType);
			return loanService.getLoanType(loanType.getId());
		}
		return null;
	}

//	@NotNull
//Validating Forms with @Valid Annotation
//	https://www.codeproject.com/Articles/1187397/A-Tool-for-Spring-MockMvcRequestBuilder-to-Post-Fo?display=Print
	@PostMapping(value = "/addLoanType")
	public LoanType addLoanType(@RequestBody LoanType loanType) {
		if (loanType != null) {
			LoanType lt = loanService.createLoanType(loanType);
			return loanService.getLoanType(lt.getId());
		}
		return null;
	}

	@RequestMapping(value = "/deleteLoanType")
	public LoanType deleteLoanType(@RequestParam long id) {
		loanService.deleteLoanType(id);
		return null;
	}

}
