package science.mengxin.banking.userfront.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import science.mengxin.banking.userfront.dao.PrimaryAccountDao;
import science.mengxin.banking.userfront.dao.PrimaryTransactionDao;
import science.mengxin.banking.userfront.dao.SavingsAccountDao;
import science.mengxin.banking.userfront.dao.SavingsTransactionDao;
import science.mengxin.banking.userfront.domain.PrimaryTransaction;
import science.mengxin.banking.userfront.domain.SavingsTransaction;
import science.mengxin.banking.userfront.domain.User;
import science.mengxin.banking.userfront.service.TransactionService;
import science.mengxin.banking.userfront.service.UserService;

/**
 * User:    mengxin
 * Date:    14/11/2017
 * Project: banking-user-front
 * Package: science.mengxin.banking.userfront.service.impl
 * Description: TransactionServiceImpl.
 *
 * @author mengxin
 * @version 1.0
 */

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private UserService userService;

    @Autowired
    private PrimaryTransactionDao primaryTransactionDao;

    @Autowired
    private SavingsTransactionDao savingsTransactionDao;

    @Autowired
    private PrimaryAccountDao primaryAccountDao;

    @Autowired
    private SavingsAccountDao savingsAccountDao;



    @Override
    public List<PrimaryTransaction> findPrimaryTransactionList(String username){
        User user = userService.findByUsername(username);
        List<PrimaryTransaction> primaryTransactionList = user.getPrimaryAccount().getPrimaryTransactionList();

        return primaryTransactionList;
    }

    @Override
    public List<SavingsTransaction> findSavingsTransactionList(String username) {
        User user = userService.findByUsername(username);
        List<SavingsTransaction> savingsTransactionList = user.getSavingsAccount().getSavingsTransactionList();

        return savingsTransactionList;
    }

    @Override
    public void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction) {
        primaryTransactionDao.save(primaryTransaction);
    }

    @Override
    public void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction) {
        savingsTransactionDao.save(savingsTransaction);
    }

}
