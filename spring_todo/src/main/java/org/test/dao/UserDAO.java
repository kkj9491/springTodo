package org.test.dao;

import java.util.List;

import org.test.model.UserVO;

public interface UserDAO {

	public void create (UserVO userVO)throws Exception;
	
	public UserVO read(String id)throws Exception;
	
	public void update(UserVO userVO)throws Exception;
	
	public void delete(String id)throws Exception;
	
	public List<UserVO> listAll()throws Exception;
	
}
