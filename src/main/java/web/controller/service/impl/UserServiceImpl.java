package web.controller.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.controller.dao.IUserDao;
import web.controller.model.User;
import web.controller.service.IUserService;

/**
 * Created by apple on 2017/5/14.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public User findUserById(int id) {
        return userDao.findUserById(id);
        //return userDao.findUserById(id);
    }

    public void addUser(User user) {
        userDao.addUser(user);

    }
}
