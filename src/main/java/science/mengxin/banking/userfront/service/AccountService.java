package science.mengxin.banking.userfront.service;

import java.security.Principal;
import org.springframework.stereotype.Service;
import science.mengxin.banking.userfront.domain.PrimaryAccount;
import science.mengxin.banking.userfront.domain.SavingsAccount;

/**
 * User:    mengxin
 * Date:    06/11/2017
 * Project: banking-user-front
 * Package: science.mengxin.banking.userfront.service
 * Description: AccountService.
 *
 * @author mengxin
 * @version 1.0
 */

@Service
public interface AccountService {
    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double v, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);
}
