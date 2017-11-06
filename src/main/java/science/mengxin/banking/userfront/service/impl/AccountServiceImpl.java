package science.mengxin.banking.userfront.service.impl;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import science.mengxin.banking.userfront.dao.PrimaryAccountDao;
import science.mengxin.banking.userfront.dao.SavingsAccountDao;
import science.mengxin.banking.userfront.domain.PrimaryAccount;
import science.mengxin.banking.userfront.domain.SavingsAccount;
import science.mengxin.banking.userfront.service.AccountService;
import science.mengxin.banking.userfront.service.UserService;

/**
 * User:    mengxin
 * Date:    06/11/2017
 * Project: banking-user-front
 * Package: science.mengxin.banking.userfront.service.impl
 * Description: AccountServiceImpl.
 *
 * @author mengxin
 * @version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static int nextAccountNumber = 11223145;

    @Autowired
    private PrimaryAccountDao primaryAccountDao;

    @Autowired
    private SavingsAccountDao savingsAccountDao;

    @Autowired
    private UserService userService;

    @Override
    public PrimaryAccount createPrimaryAccount() {
        PrimaryAccount primaryAccount = new PrimaryAccount();
        primaryAccount.setAccountBalance(new BigDecimal(0.0));
        primaryAccount.setAccountNumber(accountGen());

        primaryAccountDao.save(primaryAccount);

        return primaryAccountDao.findByAccountNumber(primaryAccount.getAccountNumber());
    }

    @Override
    public SavingsAccount createSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountBalance(new BigDecimal(0.0));
        savingsAccount.setAccountNumber(accountGen());

        savingsAccountDao.save(savingsAccount);

        return savingsAccountDao.findByAccountNumber(savingsAccount.getAccountNumber());
    }

    private int accountGen() {
        return ++nextAccountNumber;
    }
}
