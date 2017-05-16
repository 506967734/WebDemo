package web.controller.dao;

import web.controller.model.User;

/**
 * Created by apple on 2017/5/14.
 */
public interface IUserDao {
    public User findUserById(int id); //查询

    public void addUser(User user); //添加
}
