package org.test.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.test.model.UserVO;

public class UserDAOImpl implements UserDAO{
	
	
	private static final String namespace = "org.test.mapper.UserMapper";
	
	@Inject
	SqlSessionTemplate session;

	@Override
	public void create(UserVO userVO) throws Exception {		
		session.insert(namespace + ".create", userVO);
		
	}


	@Override
	public UserVO read(Integer user_num) throws Exception {
		return session.selectOne(namespace + ".read", user_num);
	}

	@Override
	public void update(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer user_num) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
