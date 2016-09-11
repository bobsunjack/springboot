package com.test.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.demo1.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

}
