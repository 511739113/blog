package cn.com.user;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import cn.com.blog.business.user.pojo.User;
import cn.com.blog.business.user.service.IUserService;
import cn.com.blog.business.user.service.impl.UserServiceImpl;


/**
 * userService 测试类
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>公司: www.molinkx.com</p>
 * @autho zhangxu
 * @time 2017年1月1日 上午3:53:53
*/
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestUser {
	
	/** log4j 日志 */
	private static Logger logger = Logger.getLogger(TestUser.class);  
	
	/** 注入userServiceImpl */
	@Resource
	private IUserService userService;
	
	
	/**
	 * 测试 mybatis集成
	 * <p>方法名称：</p>
	 * <p>方法说明：</p>
	 * @autho zhangxu
	 * @time 2017年1月1日 上午4:25:07
	 */
	@Test
	public void test1(){
		User user = userService.queryUserById(1);
		logger.info(user);
	}
	
	/**
	 * 测试事物
	 * <p>方法名称：</p>
	 * <p>方法说明：</p>
	 * @autho zhangxu
	 * @time 2017年1月1日 上午4:25:25
	 */
	@Transactional
	@Test
	public void test2(){
		User user = new User(2,"test2","123456",18);
		userService.addUser(user);
		if(1==1){
			throw new RuntimeException();
		}
		User user2 = new User(3, "test3", "123456", 20);
		userService.addUser(user2);
	}
	
}
