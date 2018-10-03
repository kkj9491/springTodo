package org.test.dao;

import java.util.List;

import org.test.model.TodoVO;

public interface TodoDAO {

	public void create(TodoVO todoVO)throws Exception;
	
	public TodoVO read(Integer todo_num)throws Exception;
	
	public void update(TodoVO todoVO)throws Exception;
	
	public void delete(Integer todo_num)throws Exception;
	
	public List<TodoVO> listAll()throws Exception;	
	
}
