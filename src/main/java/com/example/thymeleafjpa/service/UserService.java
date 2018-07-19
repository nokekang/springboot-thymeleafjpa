package com.example.thymeleafjpa.service;

import com.example.thymeleafjpa.domain.User;

import java.util.List;

public interface UserService {
    /** 
    * @Description: 查所有
    * @Param: [] 
    * @return: java.util.List<com.example.thymeleafjpa.domain.User>
    */ 
    List<User> getUserList();
    /** 
    * @Description:  查单个
    * @Param: [id] 
    * @return: com.example.thymeleafjpa.domain.User
    */ 
    User findUserById(Long id);
    /** 
    * @Description: 增
    * @Param: [user] 
    * @return: void
    */ 
    void save(User user);
    void edit(User user);
    void delete(Long id);

}
