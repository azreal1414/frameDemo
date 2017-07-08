package frame.ssm.demo.dao; 
import  frame.ssm.demo.model.TDRoleRelation; 

import  java.util.*;

import frame.ssm.demo.common.base.BaseMapper;

public interface TDRoleRelationMapper extends BaseMapper<TDRoleRelation>{  

     /***  @Costom ***/
	
	List<String> selectRoleByUserAccount(String account);
	
	List<TDRoleRelation> selectRoleByUserAccount(TDRoleRelation relation);
}