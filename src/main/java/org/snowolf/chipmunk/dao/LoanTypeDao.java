/**
 * 
 */
package org.snowolf.chipmunk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.snowolf.chipmunk.domain.LoanType;

/**
 * @author snowolf
 *
 */
@Mapper
public interface LoanTypeDao {

	/**
	 * @param loanType
	 */
	public void create(LoanType loanType);

	/**
	 * @param id
	 * @return
	 */
	public LoanType read(long id);

	/**
	 * @param loanType
	 */
	public void update(LoanType loanType);


	/**
	 * @param id
	 */
	public void delete(long id);

	/**
	 * @return
	 */
	public List<LoanType> readAll();
	
}
