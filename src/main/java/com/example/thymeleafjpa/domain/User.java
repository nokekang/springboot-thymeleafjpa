package com.example.thymeleafjpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue//默认为Auto自增策略
    private Long id;
    @Column(nullable = false,unique = true)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Integer age;
 }
