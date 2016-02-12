package cn.panda.service.impl;

import cn.panda.dao.WeiBoDao;
import cn.panda.domain.User;
import cn.panda.domain.WeiBo;
import cn.panda.service.WeiBoService;

import java.util.List;

/**
 * Created by panda on 16-2-12.
 */
public class WeiBoServiceImpl implements WeiBoService {

    private WeiBoDao weiBoDao;

    public void setWeiBoDao(WeiBoDao weiBoDao) {
        this.weiBoDao = weiBoDao;
    }

    @Override
    public void addWeiBo(WeiBo weibo) {
        weiBoDao.add(weibo);
    }

    @Override
    public void delWeiBo(String id) {
        weiBoDao.delete(id);
    }

    @Override
    public List<WeiBo> findByUser(User user) {

        return weiBoDao.findByUser(user);
    }

    @Override
    public List<WeiBo> findSelf(User user) {

        return weiBoDao.findSelfWeiBo(user);
    }
}
