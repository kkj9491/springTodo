package org.test.dao;

import java.util.List;

import org.test.model.TodoVO;

public interface TodoDAO {

	public void create(TodoVO todoVO)throws Exception;
	
	public TodoVO read(String todo)throws Exception;
	
	public void update(TodoVO todoVO)throws Exception;
	
	public void delete(String todo)throws Exception;
	
	public List<TodoVO> listAll()throws Exception;	
	
}
