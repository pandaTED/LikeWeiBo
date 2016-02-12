package cn.panda.service;

import cn.panda.domain.User;
import cn.panda.domain.WeiBo;

import java.util.List;

/**
 * Created by panda on 16-2-12.
 */
public interface WeiBoService {
    //发微博   void addWeiBo(WeiBo weibo)
    //删微博   void delWeiBo   (String id)
    //登陆后查看所有微博，包括自己和关注的人的   List<WeiBo>   findByUser(User user)
    //查看自己微博                    List<WeiBo>  findSelf(User user)
    void addWeiBo(WeiBo weibo);

    void delWeiBo(String id);

    List<WeiBo> findByUser(User user);

    List<WeiBo> findSelf(User user);
}
