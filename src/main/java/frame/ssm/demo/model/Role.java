package frame.ssm.demo.model;

import frame.ssm.demo.common.base.BaseModel;

public class Role extends BaseModel{
	
	private String role;
	
	private String roleName;
	
	private String roleLevel;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleLevel() {
		return roleLevel;
	}

	public void setRoleLevel(String roleLevel) {
		this.roleLevel = roleLevel;
	}
	
}
