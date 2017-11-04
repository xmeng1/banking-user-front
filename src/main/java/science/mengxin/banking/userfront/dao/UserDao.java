package science.mengxin.banking.userfront.dao;

import org.springframework.data.repository.CrudRepository;
import science.mengxin.banking.userfront.domain.User;

/**
 * User:    mengxin
 * Date:    04/11/2017
 * Project: banking-user-front
 * Package: science.mengxin.banking.userfront.dao
 * Description: UserDao.
 *
 * @author mengxin
 * @version 1.0
 */
public interface UserDao extends CrudRepository<User, Long>{

    // only define the method in interface, which has default implement by the name
    //  of method.
    User findByUsername(String username);

    User findByEmail(String email);
}
