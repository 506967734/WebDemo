package web.controller.service;

import web.controller.model.User;

/**
 * Created by apple on 2017/5/14.
 */
public interface IUserService {
    public User findUserById(int id);

    public void addUser(User user);
}
