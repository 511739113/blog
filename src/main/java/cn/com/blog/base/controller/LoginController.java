package cn.com.blog.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 登陆controller
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>公司: www.molinkx.com</p>
 * @autho zhangxu
 * @time 2017年1月1日 上午7:03:06
*/
@Controller
@RequestMapping("/loginController")
public class LoginController {
	
	@RequestMapping("/testLogin")
	@ResponseBody
	public String testLogin(HttpServletRequest request){
		
		
		return "测试 springMVC 配置成功";
	}
	
}
