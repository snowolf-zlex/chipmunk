/**
 *
 */
package org.snowolf.chipmunk.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.snowolf.chipmunk.dao.LoanDetailDao;
import org.snowolf.chipmunk.dao.LoanPlanDao;
import org.snowolf.chipmunk.dao.LoanTypeDao;
import org.snowolf.chipmunk.domain.LoanDetail;
import org.snowolf.chipmunk.domain.LoanPlan;
import org.snowolf.chipmunk.domain.LoanType;
import org.snowolf.chipmunk.service.LoanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Snowolf
 */
@Service
@Transactional
public class LoanServiceImpl implements LoanService {

    @Resource
    private LoanDetailDao loanDetailsDao;

    @Resource
    private LoanTypeDao loanTypeDao;

    @Resource
    private LoanPlanDao loanPlanDao;

    /*
     * (non-Javadoc)
     *
     * @see org.snowolf.smart.finance.service.LoanService#listAll(long, long)
     */
    @Override
    public List<LoanDetail> listAllLoanDetailsByPlanId(long planId) {

        if (planId < 1) {
            return null;
        }

        return loanDetailsDao.readListByPlanId(planId);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.snowolf.chipmunk.service.LoanService#listAllLoanPlans()
     */
    @Override
    public List<LoanPlan> listAllLoanPlans() {
        return loanPlanDao.readAll();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.snowolf.chipmunk.service.LoanService#listAllLoanPlans(long)
     */
    @Override
    public List<LoanPlan> listAllLoanPlans(long typeId) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.snowolf.chipmunk.service.LoanService#getLoanPlan(long)
     */
    @Override
    public LoanPlan getLoanPlan(long id) {
        if (id < 1) {
            return null;
        } else {
            return loanPlanDao.read(id);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.snowolf.chipmunk.service.LoanService#listAllLoanTypes()
     */
    @Override
    public List<LoanType> listAllLoanTypes() {

        return loanTypeDao.readAll();
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.snowolf.chipmunk.service.LoanService#updateLoanPlan(org.snowolf.smart.domain
     * .LoanPlan)
     */
    @Override
    public void updateLoanPlan(LoanPlan loanPlan) {
    }

    //	loanPlanDao.create(loanPlan);
    /*
     * (non-Javadoc)
     *
     * @see
     * org.snowolf.chipmunk.service.LoanService#updateLoanType(org.snowolf.chipmunk.domain
     * .LoanType)
     */
    @Override
    public void updateLoanType(LoanType loanType) {
        loanTypeDao.update(loanType);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.snowolf.chipmunk.service.LoanService#getLoanType(long)
     */
    @Override
    public LoanType getLoanType(long id) {
        return loanTypeDao.read(id);
    }

    /* (non-Javadoc)
     * @see org.snowolf.chipmunk.service.LoanService#deleteLoanType(long)
     */
    @Override
    public void deleteLoanType(long id) {

        loanTypeDao.delete(id);
    }

    @Override
    public LoanType createLoanType(LoanType loanType) {
        loanTypeDao.create(loanType);
        return loanTypeDao.read(loanType.getId());
    }
}
