package com.example.thymeleafjpa.service.impl;

import com.example.thymeleafjpa.dao.UserRepository;
import com.example.thymeleafjpa.domain.User;
import com.example.thymeleafjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: thymeleafjpa
 * @description: UserService
 * @author: sjk
 * @create: 2018-07-18 17:01
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUserList() {
        List<User> uList = userRepository.findAll();
        return uList;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void edit(User user) {

    }

    @Override
    public void delete(Long id) {

    }
}
