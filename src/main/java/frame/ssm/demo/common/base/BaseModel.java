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
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 创建人
	 */
	private String createUser;
	/**
	 * 修改时间
	 */
	private String updateTime;
	/**
	 * 修改人
	 */
	private String updateUser;
	/**
	 * 是否删除
	 */
	private Integer delFlag;
	/**
	 * 启用状态
	 */
	private Integer enable;
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
    
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Integer getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
	public Integer getEnable() {
		return enable;
	}
	public void setEnable(Integer enable) {
		this.enable = enable;
	}
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
