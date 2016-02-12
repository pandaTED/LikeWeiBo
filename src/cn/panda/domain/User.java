package cn.panda.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by cn.panda on 2016/2/2 0002.
 */
public class User {
    private String id;
    private String username;
    private String password;
    private String name;
    private List<User> followerList;
    private Date registerDate;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public List<User> getFollowerList() {
        return followerList;
    }

    public void setFollowerList(List<User> followerList) {
        this.followerList = followerList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}
