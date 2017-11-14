package science.mengxin.banking.userfront.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import science.mengxin.banking.userfront.domain.PrimaryTransaction;

/**
 * User:    mengxin
 * Date:    14/11/2017
 * Project: banking-user-front
 * Package: science.mengxin.banking.userfront.dao
 * Description: PrimaryTransactionDao.
 *
 * @author mengxin
 * @version 1.0
 */
public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long>{
    List<PrimaryTransaction> findAll();
}
