package cn.panda.service.impl;

import cn.panda.dao.UserDao;
import cn.panda.domain.User;
import cn.panda.service.UserService;

import java.util.List;

/**
 * Created by cn.panda on 2016/2/3 0003.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User login(String username, String password) {
        User user = userDao.findByUsername_Password(username, password);
        return user;
    }

    @Override
    public void register(User user) {

        userDao.add(user);

    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void delete(String id) {
        userDao.deleteById(id);
    }

    @Override
    public User findById(String id) {
        return userDao.findById(id);

    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
