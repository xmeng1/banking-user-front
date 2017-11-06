package science.mengxin.banking.userfront.dao;

import org.springframework.data.repository.CrudRepository;
import science.mengxin.banking.userfront.domain.security.Role;

/**
 * User:    mengxin
 * Date:    06/11/2017
 * Project: banking-user-front
 * Package: science.mengxin.banking.userfront.dao
 * Description: RoleDao.
 *
 * @author mengxin
 * @version 1.0
 */
public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
