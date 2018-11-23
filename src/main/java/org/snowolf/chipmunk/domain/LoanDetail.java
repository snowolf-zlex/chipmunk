/**
 * 
 */
package org.snowolf.chipmunk.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Snowolf
 *
 */
public class LoanDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1691423022762393009L;

	private long id;
	private LoanPlan loanPlan;
	private BigDecimal principal;
	private BigDecimal interest;
	private BigDecimal totalLiabilities;
	private BigDecimal amount;
	private Date paymentDate;
	private int loopNum;

	/**
	 * @return the principal
	 */
	public BigDecimal getPrincipal() {
		return principal;
	}

	/**
	 * @param principal the principal to set
	 */
	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	/**
	 * @return the interest
	 */
	public BigDecimal getInterest() {
		return interest;
	}

	/**
	 * @param interest the interest to set
	 */
	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	/**
	 * @return the totalLiabilities
	 */
	public BigDecimal getTotalLiabilities() {
		return totalLiabilities;
	}

	/**
	 * @param totalLiabilities the totalLiabilites to set
	 */
	public void setTotalLiabilities(BigDecimal totalLiabilities) {
		this.totalLiabilities = totalLiabilities;
	}

	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * @return the loopNum
	 */
	public int getLoopNum() {
		return loopNum;
	}

	/**
	 * @param loopNum the loopNum to set
	 */
	public void setLoopNum(int loopNum) {
		this.loopNum = loopNum;
	}

	/**
	 * @return the loanPlan
	 */
	public LoanPlan getLoanPlan() {
		return loanPlan;
	}

	/**
	 * @param loanPlan the loanPlan to set
	 */
	public void setLoanPlan(LoanPlan loanPlan) {
		this.loanPlan = loanPlan;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
