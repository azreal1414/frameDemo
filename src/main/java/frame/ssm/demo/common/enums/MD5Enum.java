package frame.ssm.demo.common.enums;
/**
 * MD5枚举
 * @author ZhouYu
 * @version 1.0
 */
public enum MD5Enum {
	
	MD_PARAM("demo",3);
	
	private String salt;
	
	private Integer item;
	
	MD5Enum(String salt, Integer item){
		this.salt = salt;
		this.item = item;
	}

	public String getSalt() {
		return salt;
	}

	public Integer getItem() {
		return item;
	}
}
