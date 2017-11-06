package science.mengxin.banking.userfront.service;

import java.util.Set;
import org.springframework.stereotype.Service;
import science.mengxin.banking.userfront.domain.User;
import science.mengxin.banking.userfront.domain.security.UserRole;

/**
 * User:    mengxin
 * Date:    04/11/2017
 * Project: banking-user-front
 * Package: science.mengxin.banking.userfront.service
 * Description: UserService.
 *
 * @author mengxin
 * @version 1.0
 */

@Service
public interface UserService {

    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);

    void save (User user);

    User createUser(User user, Set<UserRole> userRoles);
}
