package cn.com.blog.business.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.blog.business.user.service.IUserService;

@Controller
@RequestMapping("/userController")
public class UserController {
	
	/** 注入userService */
	@Resource
	private IUserService userService;
	
	
}
