package cn.panda.service;

import cn.panda.domain.User;

import java.util.List;

/**
 * Created by panda on 16-2-12.
 */
public interface UserService {
    User login(String username, String password);

    void register(User user);

    List<User> findAll();

    void delete(String id);

    User findById(String id);

    void update(User user);
}
