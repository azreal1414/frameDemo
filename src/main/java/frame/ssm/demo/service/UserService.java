package frame.ssm.demo.service;


import java.util.List;

import frame.ssm.demo.common.base.BaseService;
import frame.ssm.demo.model.User;

public interface UserService extends BaseService<User>{
    /**
     * 根据用户名查询用户是否存在
     *
     * @param username 用户名
     * @return true false
     */
	User getUserByUsername(String account);

    /**
     * 获取用户的所有角色
     *
     * @param userId 用户id
     * @return 角色列表
     */
    List<String> getRolesByUserId(Integer account);
}
