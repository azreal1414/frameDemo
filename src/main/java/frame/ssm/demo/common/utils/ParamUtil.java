package frame.ssm.demo.common.utils;
/**
 * 参数验证工具类
 * @author ZhouYu
 * @version 1.0
 */
public class ParamUtil {
	/**
	 * 判断输入参数是否为空  
	 * 为空返回true,不为空则返回false
	 * @param param
	 * @return
	 */
	public static boolean isBlank(String param){
		if (param == null || "".equals(param)) {
			return true;
		}
		for (int i = 0; i < param.length(); i++) {
			if (!Character.isWhitespace(param.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	/**
	 * 判断两个参数是否相等
	 * @param paramA
	 * @param paramB
	 * @return
	 */
	public static boolean isEqualed(String paramA, String paramB){
		if (isBlank(paramA) || isBlank(paramB)) {
			return false;
		}
		if (!paramA.equals(paramB)) {
			return false;
		}
		return true;
	}
	/**
	 * 判断两个参数是否相等
	 * @param paramA
	 * @param paramB
	 * @return
	 */
	public static boolean isEqualed(String paramA, Integer paramB){
		if (isBlank(paramA) || paramB == null) {
			return false;
		}
		if (!paramA.equals(paramB.toString())) {
			return false;
		}
		return true;
	}
}
