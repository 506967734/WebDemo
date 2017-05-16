package web.controller.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import web.controller.model.User;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by apple on 2017/5/14.
 */
public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory sessionFactory;
    private SqlSession session;

    public UserDaoImpl() {
        String resource = "conf.xml";
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            session = sessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public User findUserById(int id) {
        String statement = "userMapper.findUserById";
        User user = (User) session.selectOne(statement, id);
        return user;
    }

    public void addUser(User user) {
        String statement = "userMapper.addUser";
        session.insert(statement, user);
        session.commit();  //一定要记得commit
    }
}
