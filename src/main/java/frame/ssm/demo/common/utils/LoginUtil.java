package frame.ssm.demo.common.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import frame.ssm.demo.common.enums.MD5Enum;

/**
 * 登录公用工具类
 * @author ZhouYu
 * @version 1.0
 */
public class LoginUtil {
	/**
	 * 用户登录
	 * @param id 用户账号
	 * @param pwd 用户密码
	 * @return map {success:true/false, message:""}
	 */
	public static boolean login(String id, String pwd){
		//MD5加密
		pwd = MD5Util.getPwd(pwd, MD5Enum.MD_PARAM.getSalt(), 
				MD5Enum.MD_PARAM.getItem());
		//使用shiro实现用户登录
		UsernamePasswordToken token = new UsernamePasswordToken(id, pwd);
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(token);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
