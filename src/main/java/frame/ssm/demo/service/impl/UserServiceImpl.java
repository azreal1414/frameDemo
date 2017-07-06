package frame.ssm.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frame.ssm.demo.dao.RoleRelationMapper;
import frame.ssm.demo.dao.UserMapper;
import frame.ssm.demo.model.RoleRelation;
import frame.ssm.demo.model.User;
import frame.ssm.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private RoleRelationMapper roleRelationMapper;

	@Override
	public int insert(User entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(User entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByPrimaryKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(User entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> selectList(User entity) {
		
		return userMapper.selectList(entity);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getUserByUsername(String account) {
		return userMapper.getUserByUsername(account);
	}

	@Override
	public List<String> selectRoleByUserAccount(String account) {
		return roleRelationMapper.selectRoleByUserAccount(account);
	}

	@Override
	public List<RoleRelation> getRolesByUserId(String account) {
		return roleRelationMapper.getRolesByUserId(account);
	}

}
