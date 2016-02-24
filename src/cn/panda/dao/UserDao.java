package cn.panda.dao;

import cn.panda.domain.User;

import java.util.List;

/**
 * Created by cn.panda on 2016/2/2 0002.
 */
public interface UserDao {
    void add(User user);            //注册时使用

    User findByUsername_Password(String username, String password);  //登录时使用

    List<User> findAll();                       //后台管理时使用

    User findById(String id);                     //后台管理时使用

    void deleteById(String id);                   //用户销户时使用

    void update(User user);

}
