package cn.com.blog.business.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.blog.business.user.dao.UserMapper;
import cn.com.blog.business.user.pojo.User;
import cn.com.blog.business.user.service.IUserService;


/**
 * userService 实现类
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>公司: www.molinkx.com</p>
 * @autho zhangxu
 * @time 2017年1月1日 上午3:50:35
*/
@Service
public class UserServiceImpl implements IUserService{

	/** 注入userMapper */
	@Resource
	private UserMapper userMapper;
	
	/**
	 * (non-Javadoc)
	 * @see cn.com.blog.business.user.service.IUserService#addUser(cn.com.blog.business.user.pojo.User)
	 * @autho zhangxu
	 * @time 2017年1月1日 上午3:50:50
	 */
	public void addUser(User user) {
		userMapper.insert(user);
	}

	/**
	 * (non-Javadoc)
	 * @see cn.com.blog.business.user.service.IUserService#queryUserById(java.lang.Integer)
	 * @autho zhangxu
	 * @time 2017年1月1日 上午3:50:53
	 */
	public User queryUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
