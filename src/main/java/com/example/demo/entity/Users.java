package com.example.demo.entity;
//sgq
import lombok.Data;

import java.io.Serializable;

@Data
public class Users implements Serializable {

    private int userid;
    private String userName;
    private String password;
    private String userRole;
    private String userState;

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userRole='" + userRole + '\'' +
                ", userState='" + userState + '\'' +
                '}';
    }

    public Users(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Users(int userid, String userName, String password, String userRole, String userState) {
        this.userid = userid;
        this.userName = userName;
        this.password = password;
        this.userRole = userRole;
        this.userState = userState;
    }

    public Users() {
        super();
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

}
