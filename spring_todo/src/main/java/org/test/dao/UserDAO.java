package org.test.dao;

import java.util.List;

import org.test.model.UserVO;

public interface UserDAO {	
	
	public void create (UserVO userVO)throws Exception;
	
	public UserVO read(Integer user_num)throws Exception;
	
	public void update(UserVO userVO)throws Exception;
	
	public void delete(Integer user_num)throws Exception;
	
	public List<UserVO> listAll()throws Exception;
	
}
