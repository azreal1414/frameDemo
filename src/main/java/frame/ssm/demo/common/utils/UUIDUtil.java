package frame.ssm.demo.common.utils;

import java.util.UUID;

/**
 * 生成UUID公用方法
 * @author ZhouYu
 * @version 1.0
 */
public class UUIDUtil {
	
	public String getUUID(){
		return UUID.randomUUID().toString();
	}
}
