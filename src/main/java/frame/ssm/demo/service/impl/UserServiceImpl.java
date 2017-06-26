package frame.ssm.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frame.ssm.demo.dao.UserMapper;
import frame.ssm.demo.model.User;
import frame.ssm.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getUserByUsername(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getRolesByUserId(Integer account) {
		// TODO Auto-generated method stub
		return null;
	}

}
