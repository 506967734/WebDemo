package web.controller.service;

import web.controller.exception.UserDuplicateException;
import web.controller.model.User;

/**
 * Created by apple on 2017/5/14.
 */
public interface IUserService {
    public User findUserById(int id) throws Exception;

    public void addUser(User user) throws Exception;

    public void saveWithCheckDuplicate(User user) throws UserDuplicateException;

    public User login(User user) throws Exception;
}
