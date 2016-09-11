package com.test.demo1.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.demo1.dao.UserDao;
import com.test.demo1.entity.User;
import com.test.demo1.service.IUserService;

@Controller
public class UserController {
	 static Logger logger = LogManager.getLogger(UserController.class.getName());
	@Autowired
	private IUserService userService;
	@Autowired
	private UserDao userDao;
	@RequestMapping("/add")
	public ModelAndView one() {
		logger.info("this is a book");
		ModelAndView model = new ModelAndView("show");
		User user = new User();
		user.setAge(1);
		user.setName("用户名");
		userService.save(user);
		model.addObject("id", user.getId());
		return model;
	}
	
	@RequestMapping("/find")
	public ModelAndView two() {
		ModelAndView model = new ModelAndView("show");
		PageRequest page=new PageRequest(0, 1, Sort.DEFAULT_DIRECTION.DESC,"id");
		Page<User> result=userDao.findAll(page);
		return model;
	}
}
