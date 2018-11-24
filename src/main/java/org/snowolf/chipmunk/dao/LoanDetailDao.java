/**
 *
 */
package org.snowolf.chipmunk.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.snowolf.chipmunk.domain.LoanDetail;

/**
 * @author Snowolf
 */
@Mapper
public interface LoanDetailDao {

    /**
     * 获取指定的贷款计划
     */
    public List<LoanDetail> readList(long planId, long typeId);

    /**
     *
     */
    public List<LoanDetail> readListByPlanId(long planId);

    /**
     *
     */
    public List<LoanDetail> readListByTypeId(long typeId);
}
