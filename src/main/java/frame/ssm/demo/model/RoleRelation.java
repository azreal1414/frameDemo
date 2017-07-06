package frame.ssm.demo.model;

import frame.ssm.demo.common.base.BaseModel;

public class RoleRelation extends BaseModel{
	
	private String relationUuid;
	
	private String userAccount;
	
	private String roleUuid;
	
	private String parentUuid;

	public String getRelationUuid() {
		return relationUuid;
	}

	public void setRelationUuid(String relationUuid) {
		this.relationUuid = relationUuid;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getRoleUuid() {
		return roleUuid;
	}

	public void setRoleUuid(String roleUuid) {
		this.roleUuid = roleUuid;
	}

	public String getParentUuid() {
		return parentUuid;
	}

	public void setParentUuid(String parentUuid) {
		this.parentUuid = parentUuid;
	}
}
