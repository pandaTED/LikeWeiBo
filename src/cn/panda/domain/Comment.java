package cn.panda.domain;

import java.util.Date;

/**
 * Created by cn.panda on 2016/2/2 0002.
 */
public class Comment {
    private String id;
    private Date doDate;
    private String text;
    private User user;
    private WeiBo weiBo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDoDate() {
        return doDate;
    }

    public void setDoDate(Date doDate) {
        this.doDate = doDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public WeiBo getWeiBo() {
        return weiBo;
    }

    public void setWeiBo(WeiBo weiBo) {
        this.weiBo = weiBo;
    }
}
