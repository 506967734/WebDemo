package web.controller.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.controller.dao.IUserDao;
import web.controller.exception.UserDuplicateException;
import web.controller.model.User;
import web.controller.service.IUserService;

import java.util.Date;

/**
 * Created by apple on 2017/5/14.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public User findUserById(int id) throws Exception {
        try {
            return userDao.findUserById(id);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void addUser(User user) throws Exception {
        try {
            userDao.addUser(user);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override
    public void saveWithCheckDuplicate(User user) throws UserDuplicateException {
        if (userDao.findByUsername(user.getUsername()) != null) {
            throw new UserDuplicateException();
        }
        user.setCreateTime(new Date());
        user.setUserAlias(user.getUsername());
        userDao.save(user);

    }

    /**
     * 登录
     *
     * @param user
     * @throws Exception
     */
    @Override
    public User login(User user) throws Exception {
        try {
            User mode = userDao.login(user);
            if (mode == null) {
                throw new Exception();
            }
            return mode;
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
