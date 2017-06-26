package frame.ssm.demo.common.enums;
/**
 * 时间戳枚举
 * @author ZhouYu
 * @version 1.0
 */
public enum TimeStampEnums {
	TIME_YMD("yyyy-MM-dd"),
	TIME_YMD_HMS("yyyy-MM-dd HH:mm:ss"),
	TIME_YMD_HMS_SSS("yyyy-MM-dd HH:mm:ss.SSS"),
	TIME_STAMP("yyyyMMddHHmmssSSS");
	
	private String stamp;
	
	TimeStampEnums(String stamp){
		this.stamp = stamp;
	}

	public String getStamp() {
		return stamp;
	}

	public void setStamp(String stamp) {
		this.stamp = stamp;
	}
}
