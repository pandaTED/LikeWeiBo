package cn.panda.dao;

import cn.panda.domain.User;
import cn.panda.domain.WeiBo;

/**
 * Created by cn.panda on 2016/2/2 0002.
 */
public interface CommentDao {
    void add(WeiBo weiBo, User user);

}
