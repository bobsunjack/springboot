package com.test.demo1.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import com.test.demo1.dao.UserDao;
import com.test.demo1.entity.User;
import com.test.demo1.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserDao userDao;
	@Override
	@Transactional
	public User save(User user) {		 
		 userDao.save(user);
		 if(1==1){
			 throw new RuntimeException("111");
		 }
		 return null;
	}

	@Override
	public User get(Long id) {		 
		return userDao.findOne(id);
	}

}
