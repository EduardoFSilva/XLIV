package model.bean;

import java.io.Serializable;

public class UserBEAN implements Serializable{

    private int id;
    private String nick;
    private String name;
    private String role;
    private String email;
    private String password;

    public UserBEAN() {
    }

    public UserBEAN init() {
        this.id = -1;
        this.nick = "";
        this.name = "";
        this.role = "";
        this.email = "";
        this.password = "";
        return this;
    }

    public UserBEAN(int id, String nick,String name, String role, String email, String password) {
        this.id = id;
        this.nick = nick;
        this.name = name;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public UserBEAN(String nick, String name, String role, String email, String password) {
        this.name = name;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserBEAN getUser() {
        return this;
    }

    public void setUser(UserBEAN userBean) {
        this.id = userBean.getId();
        this.name = userBean.getName();
        this.role = userBean.getRole();
        this.email = userBean.getEmail();
        this.password = userBean.getPassword();
    }
}
