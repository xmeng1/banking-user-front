package science.mengxin.banking.userfront.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import science.mengxin.banking.userfront.domain.SavingsTransaction;

/**
 * User:    mengxin
 * Date:    14/11/2017
 * Project: banking-user-front
 * Package: science.mengxin.banking.userfront.dao
 * Description: SavingsTransactionDao.
 *
 * @author mengxin
 * @version 1.0
 */
public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {
    List<SavingsTransaction> findAll();
}
