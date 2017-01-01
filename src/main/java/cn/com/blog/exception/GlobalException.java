package cn.com.blog.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;


/**
 * 全局异常处理
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>公司: www.molinkx.com</p>
 * @autho zhangxu
 * @time 2017年1月1日 上午6:23:34
*/
public class GlobalException implements HandlerExceptionResolver{

	
	public ModelAndView resolveException(HttpServletRequest req,
			HttpServletResponse rsp, Object obj, Exception exception) {
		
		exception.printStackTrace();
		return new ModelAndView("500", "message", exception.getMessage());
	}

}
