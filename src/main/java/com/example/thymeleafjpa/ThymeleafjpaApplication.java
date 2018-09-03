package com.example.thymeleafjpa;

import com.example.thymeleafjpa.service.UserService;
import com.example.thymeleafjpa.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ThymeleafjpaApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ThymeleafjpaApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafjpaApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ThymeleafjpaApplication.class);
        UserService userServie = context.getBean(UserServiceImpl.class);
        System.out.println("/////////////////////////////////////////"+userServie.getUserList().size());
    }


}
