package com.example.base;

/**
 * @program: thymeleafjpa
 * @description: test实体
 * @author: sjk
 * @create: 2018-08-09 10:07
 **/
public class User{
    private String userName;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public User(String userName) {

        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}

