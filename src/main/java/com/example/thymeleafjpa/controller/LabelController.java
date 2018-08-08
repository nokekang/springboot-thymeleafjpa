package com.example.thymeleafjpa.controller;

import com.example.thymeleafjpa.domain.User;
import com.example.thymeleafjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: thymeleafjpa
 * @description:
 * @author: sjk
 * @create: 2018-07-18 17:03
 **/
@Controller
public class LabelController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("访问主页");
        return "index";
    }

}
