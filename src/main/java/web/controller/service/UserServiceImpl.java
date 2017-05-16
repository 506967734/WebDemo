package web.controller.service;

import org.springframework.stereotype.Service;
import web.controller.dao.IUserDao;
import web.controller.dao.UserDaoImpl;
import web.controller.model.User;

/**
 * Created by apple on 2017/5/14.
 */
@Service("IUserService")
public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }
}
