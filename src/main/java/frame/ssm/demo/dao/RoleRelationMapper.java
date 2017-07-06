package frame.ssm.demo.dao;

import java.util.List;

import frame.ssm.demo.common.base.BaseMapper;
import frame.ssm.demo.model.RoleRelation;
import frame.ssm.demo.model.User;

public interface RoleRelationMapper extends BaseMapper<RoleRelation>{
	
	List<String> selectRoleByUserAccount(String account);
	List<RoleRelation> getRolesByUserId(String account);
}
