package org.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.test.model.UserVO;

public class UserDAOImpl implements UserDAO{

	private static final String namespace = "org.test.mapper.UserMapper";
	
	@Autowired
	private SqlSession session;	
	
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
		session.update(namespace + ".update", userVO);
	}

	@Override
	public void delete(Integer user_num) throws Exception {
		session.delete(namespace + ".delete", user_num);
		
	}

	@Override
	public List<UserVO> listAll() throws Exception {		
		return session.selectList(namespace + ".listAll");
		
	}

}
