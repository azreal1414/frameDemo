package frame.ssm.demo.common.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * MD5加密工具类
 * @author ZhouYu
 * @version 1.0
 */
public class MD5Util {
	/**
	 * 获取MD5加密后的密码
	 * @param pwd  密码
	 * @param salt 盐
	 * @param item 散列次数
	 * @return 加密后的密码
	 */
	public static String getPwd(String pwd, String salt, Integer item){
		pwd = new Md5Hash(pwd, salt, item).toString();
		return pwd;
	}
}
