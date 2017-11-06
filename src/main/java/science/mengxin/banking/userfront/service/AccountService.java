package science.mengxin.banking.userfront.service;

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
}
