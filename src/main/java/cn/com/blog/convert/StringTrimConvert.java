package cn.com.blog.convert;

import org.springframework.core.convert.converter.Converter;


/**
 * 字符串去空格
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>公司: www.molinkx.com</p>
 * @autho zhangxu
 * @time 2017年1月1日 上午5:34:30
*/
public class StringTrimConvert implements Converter<String, String>{

	public String convert(String str) {
		return str.trim();
	}

	
}
