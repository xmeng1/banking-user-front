package science.mengxin.banking.userfront.dao;

import org.springframework.data.repository.CrudRepository;
import science.mengxin.banking.userfront.domain.PrimaryAccount;

/**
 * User:    mengxin
 * Date:    06/11/2017
 * Project: banking-user-front
 * Package: science.mengxin.banking.userfront.service.impl
 * Description: PrimaryAccountDao.
 *
 * @author mengxin
 * @version 1.0
 */
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {
    PrimaryAccount findByAccountNumber (int accountNumber);
}
