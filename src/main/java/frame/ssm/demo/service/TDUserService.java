package frame.ssm.demo.service;

import java.util.List;

import frame.ssm.demo.common.base.BaseService;
import frame.ssm.demo.model.TDRoleRelation;
import frame.ssm.demo.model.TDUser;

public interface TDUserService extends BaseService<TDUser>{
	/**
     * 根据用户名查询用户是否存在
     *
     * @param username 用户名
     * @return true false
     */
	TDUser getUserByUsername(String account);
	/**
	 * 根据用户登录名获取用户权限（shiro认证使用）
	 * @param account
	 * @return
	 */
	List<String> selectRoleByUserAccount(String account);
	/**
	 * 根据用户登录名获取用户权限
	 * @param account
	 * @return
	 */
	List<TDRoleRelation> selectRoleByUserAccount(TDRoleRelation relation);
}
