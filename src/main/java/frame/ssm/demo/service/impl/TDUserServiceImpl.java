package frame.ssm.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frame.ssm.demo.dao.TDRoleRelationMapper;
import frame.ssm.demo.dao.TDUserMapper;
import frame.ssm.demo.model.TDRoleRelation;
import frame.ssm.demo.model.TDUser;
import frame.ssm.demo.service.TDUserService;
@Service
public class TDUserServiceImpl implements TDUserService{
	
	@Autowired
	TDUserMapper tDUserMapper;
	
	@Autowired
	TDRoleRelationMapper tDRoleRelationMapper;

	@Override
	public int insert(TDUser entity) {
		return tDUserMapper.insert(entity);
	}

	@Override
	public int insertSelective(TDUser entity) {
		return tDUserMapper.insertSelective(entity);
	}

	@Override
	public TDUser selectByPrimaryKey(String key) {
		return tDUserMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByPrimaryKeySelective(TDUser entity) {
		return tDUserMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public int updateByPrimaryKey(TDUser entity) {
		return tDUserMapper.updateByPrimaryKey(entity);
	}

	@Override
	public List<TDUser> selectList(TDUser entity) {
		return tDUserMapper.selectList(entity);
	}

	@Override
	public int count() {
		return tDUserMapper.count();
	}

	@Override
	public TDUser getUserByUsername(String account) {
		return tDUserMapper.getUserByUsername(account);
	}

	@Override
	public List<String> selectRoleByUserAccount(String account) {
		return tDRoleRelationMapper.selectRoleByUserAccount(account);
	}

	@Override
	public List<TDRoleRelation> selectRoleByUserAccount(TDRoleRelation relation) {
		return tDRoleRelationMapper.selectRoleByUserAccount(relation);
	}

}
