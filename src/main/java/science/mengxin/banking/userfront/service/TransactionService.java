package science.mengxin.banking.userfront.service;

import java.util.List;
import org.springframework.stereotype.Service;
import science.mengxin.banking.userfront.domain.PrimaryTransaction;
import science.mengxin.banking.userfront.domain.SavingsTransaction;

/**
 * User:    mengxin
 * Date:    14/11/2017
 * Project: banking-user-front
 * Package: science.mengxin.banking.userfront.service
 * Description: TransactionService.
 *
 * @author mengxin
 * @version 1.0
 */

@Service
public interface TransactionService {

    List<PrimaryTransaction> findPrimaryTransactionList(String username);

    List<SavingsTransaction> findSavingsTransactionList(String username);

    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);
}
