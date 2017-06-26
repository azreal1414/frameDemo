package frame.ssm.demo.common.enums;
/**
 * 常量枚举
 * @author ZhouYu
 * @version 1.0
 */
public enum GlobalEnums {
	
	SUCCESS(200, "成功"),
	FAILED(400, "失败"),
	
	LOG_OUT(1001, "用户已登出"),
	NOT_LOG_IN(1002, "用户未登录"),
	NO_SESSION(1003, "共享信息为空"),
	NO_TOKEN(1004, "验证信息为空"),
	
	PWD_ERROR(2001, "用户名或密码输入错误"),
	
	PARAM_NULL(4001, "参数为空"),
	PARAM_NOT_EQUAL(4002, "参数不等");
	
	private Integer code;
	
	private String msg;
	
	GlobalEnums(Integer code, String msg){
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
