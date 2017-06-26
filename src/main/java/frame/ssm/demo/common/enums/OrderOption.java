package frame.ssm.demo.common.enums;
/**
 * 顺序枚举
 * @author ZhouYu
 * @version 1.0
 */
public enum OrderOption {
    ASC("ASC"),
    DESC("DESC");

    /**
     * 排序类型
     */
    private String type;

    OrderOption(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
