package frame.ssm.demo.common.constants;

import frame.ssm.demo.common.enums.OrderOption;

/**
 * 排序公用类
 * @author ZhouYu
 * @version 1.0
 */
public class OrderItem {
	/**
	 * 数据库字段名称
	 */
	private String columnName;
	/**
	 * 排序方式：默认倒序
	 */
	private OrderOption option = OrderOption.DESC;
	
	private OrderItem(String columnName, OrderOption option) {
        this.columnName = columnName;
        this.option = option;
    }

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public OrderOption getOption() {
		return option;
	}

	public void setOption(OrderOption option) {
		this.option = option;
	}
}
