/**
 *
 */
package org.snowolf.chipmunk.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Snowolf
 */
public class LoanPlan implements Serializable {

    private static final long serialVersionUID = 7143248656562430087L;
    private long id;
    private String name;
    private LoanType loanType;
    private boolean isUndergoing;
    private BigDecimal rate;
    private Date startDate;
    private Date endDate;
    private BigDecimal amount;
    private int loops;
    private int paymentDay;
    private BigDecimal expectedInterest;

    /**
     * @return the isUndergoing
     */
    public boolean isUndergoing() {
        return isUndergoing;
    }

    /**
     * @param isUndergoing the isUndergoing to set
     */
    public void setUndergoing(boolean isUndergoing) {
        this.isUndergoing = isUndergoing;
    }

    /**
     * @return the rate
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    /**
     * @return the loops
     */
    public int getLoops() {
        return loops;
    }

    /**
     * @param loops the loops to set
     */
    public void setLoops(int loops) {
        this.loops = loops;
    }

    /**
     * @return the paymentDay
     */
    public int getPaymentDay() {
        return paymentDay;
    }

    /**
     * @param paymentDay the paymentDay to set
     */
    public void setPaymentDay(int paymentDay) {
        this.paymentDay = paymentDay;
    }

    /**
     * @return the expectedInterest
     */
    public BigDecimal getExpectedInterest() {
        return expectedInterest;
    }

    /**
     * @param expectedInterest the expectedInterest to set
     */
    public void setExpectedInterest(BigDecimal expectedInterest) {
        this.expectedInterest = expectedInterest;
    }

    /**
     * @return the loanType
     */
    public LoanType getLoanType() {
        return loanType;
    }

    /**
     * @param loanType the loanType to set
     */
    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
