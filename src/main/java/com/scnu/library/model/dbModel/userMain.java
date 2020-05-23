package com.scnu.library.model.dbModel;

import java.io.Serializable;

public class userMain implements Serializable {
    private String userName;

    private String userPassword;

    private static final long serialVersionUID = 1L;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}