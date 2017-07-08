package frame.ssm.demo.common.base;

import java.util.List;

import frame.ssm.demo.common.constants.OrderItem;

/**
 * 数据实体公用字段
 * @author ZhouYu
 * @version1.0
 */
public class BaseModel {
	/**
	 * 排序方式
	 */
	private List<OrderItem> orderList;
	/**
     * 起始页
     */
    private Integer page;
    /**
     * 分页大小
     */
    private Integer rows;
    
	public List<OrderItem> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<OrderItem> orderList) {
		this.orderList = orderList;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
    
}
