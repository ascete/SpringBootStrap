package com.example.spring_boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.spring_boot.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User getUserByUsername(String username);
}
