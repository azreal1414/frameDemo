package frame.ssm.demo.dao; 
import  frame.ssm.demo.model.TDUser; 

import  java.util.*;

import frame.ssm.demo.common.base.BaseMapper;

public interface TDUserMapper extends BaseMapper<TDUser>{  

     /***  @Costom ***/
	
	TDUser getUserByUsername(String account);
	
	List<String> selectRoleByUserAccount(String account);
}
