package com.example.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired 
    private MessageSource messageSource;
	
	@RequestMapping("/")
	public String index(ModelMap model) {
		logger.info("this is test--------------------");
		String msg=messageSource.getMessage("hi",null,Locale.ENGLISH);
		model.addAttribute("message", "哦V人呢");
		return "index";
	}
}
