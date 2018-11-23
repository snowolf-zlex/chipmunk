/**
 * 
 */
package org.snowolf.chipmunk.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a>
 * @version 1.0
 * @since 1.0
 */
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -533698031946372178L;

	private long id;
	private String name;
	private BigDecimal quota;
	private BigDecimal profit;

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

	/**
	 * @return the quota
	 */
	public BigDecimal getQuota() {
		return quota;
	}

	/**
	 * @param quota the quota to set
	 */
	public void setQuota(BigDecimal quota) {
		this.quota = quota;
	}

	/**
	 * @return the profit
	 */
	public BigDecimal getProfit() {
		return profit;

	}

	/**
	 * @param profit the profit to set
	 */
	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}
}
