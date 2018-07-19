package com.example.thymeleafjpa.dao;

import com.example.thymeleafjpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
