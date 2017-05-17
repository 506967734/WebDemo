package web.controller.dao;

import web.controller.exception.UserDuplicateException;
import web.controller.model.User;

/**
 * Created by apple on 2017/5/14.
 */
public interface IUserDao {
    public User findUserById(int id) throws Exception; //查询

    public User findByUsername(String username) throws UserDuplicateException; //查询

    public void addUser(User user) throws Exception; //添加

    public void save(User user) throws UserDuplicateException;//插入
}
