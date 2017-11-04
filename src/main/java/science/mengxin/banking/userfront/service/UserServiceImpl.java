package science.mengxin.banking.userfront.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import science.mengxin.banking.userfront.dao.UserDao;
import science.mengxin.banking.userfront.domain.User;

/**
 * User:    mengxin
 * Date:    04/11/2017
 * Project: banking-user-front
 * Package: science.mengxin.banking.userfront.service
 * Description: UserServiceImpl.
 *
 * @author mengxin
 * @version 1.0
 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public boolean checkUserExists(String username, String email) {
        if (checkUsernameExists(username) || checkEmailExists(username)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkUsernameExists(String username) {
        if (null != findByUsername(username)) {
            return true;
        }

        return false;
    }

    @Override
    public boolean checkEmailExists(String email) {
        if (null != findByEmail(email)) {
            return true;
        }

        return false;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }
}
