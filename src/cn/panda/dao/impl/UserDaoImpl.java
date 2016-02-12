package cn.panda.dao.impl;

import cn.panda.dao.UserDao;
import cn.panda.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created by cn.panda on 2016/2/2 0002.
 */
public class UserDaoImpl implements UserDao {


    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public void add(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert(User.class.getName() + ".addUser", user);
        sqlSession.close();
    }

    @Override
    public User findByUsername_Password(String username, String password) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println("dao里username=" + username);
        System.out.println("dao里password=" + password);
        User finduser = new User(username, password);
        User user = sqlSession.selectOne(User.class.getName() + ".findByUsernameAndPassword", finduser);
        sqlSession.close();
        return user;

    }

    @Override
    public List<User> findAll() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList(User.class.getName() + ".findAll");
        sqlSession.close();
        return list;


    }

    @Override
    public User findById(String id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne(User.class.getName() + ".findById", id);
        sqlSession.close();
        return user;
    }

    @Override
    public void deleteById(String id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete(User.class.getName() + ".deleteById", id);
        sqlSession.close();
    }

    @Override
    public void update(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.update(User.class.getName() + ".update", user);
        sqlSession.close();
    }
}
