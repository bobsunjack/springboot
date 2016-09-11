package com.test.demo1.service;

import com.test.demo1.entity.User;

public interface IUserService {
	public User save(User user);
	public User get(Long id);
	
}
