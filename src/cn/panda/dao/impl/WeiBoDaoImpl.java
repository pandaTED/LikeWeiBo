package cn.panda.dao.impl;

import cn.panda.dao.WeiBoDao;
import cn.panda.domain.User;
import cn.panda.domain.WeiBo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created by panda on 16-2-12.
 */
public class WeiBoDaoImpl implements WeiBoDao {

    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public void add(WeiBo weiBo) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert(WeiBo.class.getName() + ".add", weiBo);
        sqlSession.close();
    }

    @Override
    public void update(WeiBo weiBo) {

    }

    @Override
    public void delete(String id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete(WeiBo.class.getName() + ".delete", id);
        sqlSession.close();
    }

    @Override
    public WeiBo findById(Long id) {
        return null;
    }

    @Override
    public List<WeiBo> findAll() {
        return null;
    }

    @Override
    //查询自己的和关注的人的微博，降序排列
    public List<WeiBo> findByUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        String userId = user.getId();
        List<WeiBo> list = sqlSession.selectList(WeiBo.class.getName() + ".findByUser", userId);
        sqlSession.close();
        return list;
    }

    @Override
    public List<WeiBo> findSelfWeiBo(User user) {
        System.out.println("dao里传进去的user：" + user.getId());
        String userId = user.getId();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<WeiBo> list = sqlSession.selectList(WeiBo.class.getName() + ".findSelf", userId);
        sqlSession.close();
        return list;
    }
}
