package com.example.spring_boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.spring_boot.model.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
    Role getRoleByName(String name);
}