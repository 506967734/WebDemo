package web.controller.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by apple on 2017/5/14.
 */
public class User implements Serializable {

    private String id;
    private String username;
    private String password;
    private String userAlias;
    private Date lastLoginTime;
    private Date loginTime;
    private Date createTime;

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

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User() {
    }

    public User(String username, String password, Date createTime) {
        this.username = username;
        this.password = password;
        this.createTime = createTime;
    }

    public User(String username, String password, String userAlias, Date lastLoginTime, Date loginTime, Date createTime) {
        this.username = username;
        this.password = password;
        this.userAlias = userAlias;
        this.lastLoginTime = lastLoginTime;
        this.loginTime = loginTime;
        this.createTime = createTime;
    }
}
