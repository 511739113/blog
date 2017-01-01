package cn.com.blog.business.user.service;

import cn.com.blog.business.user.pojo.User;

/**
 * 用户 service
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>公司: www.molinkx.com</p>
 * @autho zhangxu
 * @time 2017年1月1日 上午3:47:11
*/
public interface IUserService {
	
	/**
	 * 增加用户信息
	 * <p>方法名称：</p>
	 * <p>方法说明：</p>
	 * @param user
	 * @autho zhangxu
	 * @time 2017年1月1日 上午3:48:24
	 */
	public void addUser(User user);
	
	
	/**
	 * 根据 id 查询用户信息
	 * <p>方法名称：</p>
	 * <p>方法说明：</p>
	 * @param id
	 * @return
	 * @autho zhangxu
	 * @time 2017年1月1日 上午3:49:37
	 */
	public User queryUserById(Integer id);
	
}
