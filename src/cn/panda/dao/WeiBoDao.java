package cn.panda.dao;

import cn.panda.domain.User;
import cn.panda.domain.WeiBo;

import java.util.List;

/**
 * Created by cn.panda on 2016/2/2 0002.
 */
public interface WeiBoDao {

    void add(WeiBo weiBo);      //新增微博

    void update(WeiBo weiBo);   //修改微博

    void delete(String id);

    WeiBo findById(Long id);     //查询单个微博

    List<WeiBo> findAll();      //查询所有微博，后台管理使用

    List<WeiBo> findByUser(User user);      //查询个人时间线上的所有微博，关注的人和自己的，以降序排列

    List<WeiBo> findSelfWeiBo(User user);    //查询个人的所有微博

}
