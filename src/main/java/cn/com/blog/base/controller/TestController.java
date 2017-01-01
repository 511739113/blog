package cn.com.blog.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 测试配置
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>公司: www.molinkx.com</p>
 * @autho zhangxu
 * @time 2017年1月1日 上午6:09:52
*/
@Controller
@RequestMapping("/testController")
public class TestController {

	/**
	 * 测试springmvc 配置
	 * <p>方法名称：</p>
	 * <p>方法说明：</p>
	 * @return
	 * @autho zhangxu
	 * @time 2017年1月1日 上午4:48:47
	 */
	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	
	/**
	 * 测试  格式转换器
	 * <p>方法名称：</p>
	 * <p>方法说明：</p>
	 * @return
	 * @autho zhangxu
	 * @time 2017年1月1日 上午4:48:47
	 */
	@RequestMapping("/test1")
	public String test1(String id){
		System.out.println(id);
		return "test";
	}
	
	/**
	 * 测试 拦截器  配置
	 * <p>方法名称：</p>
	 * <p>方法说明：</p>
	 * @return
	 * @autho zhangxu
	 * @time 2017年1月1日 上午4:48:47
	 */
	@RequestMapping("/test2")
	public String test2(){
		return "test";
	}
	
	/**
	 * 测试 拦截器  配置
	 * <p>方法名称：</p>
	 * <p>方法说明：</p>
	 * @return
	 * @autho zhangxu
	 * @time 2017年1月1日 上午4:48:47
	 */
	@RequestMapping("/test3")
	public String test3(){
		return "test";
	}
	
	/**
	 * 测试  全局异常处理
	 * <p>方法名称：</p>
	 * <p>方法说明：</p>
	 * @autho zhangxu
	 * @time 2017年1月1日 上午6:29:58
	 */
	@RequestMapping("/testException")
	public void testException(){
		if(1==1){
			throw new RuntimeException("测试全局异常处理");
		}
	}
	
	/**
	 * 测试restful 风格 
	 * <p>方法名称：</p>
	 * <p>方法说明：</p>
	 * @param id
	 * @return
	 * @autho zhangxu
	 * @time 2017年1月1日 上午6:48:10
	 */
	@RequestMapping("/testResutFul/{id}/")
	public String testResetFul1(@PathVariable(value="id") String id){
		System.out.println(id);
		return "test";
	}
	
}
