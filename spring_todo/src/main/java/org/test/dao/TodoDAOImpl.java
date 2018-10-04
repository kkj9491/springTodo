package org.test.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.test.model.TodoVO;

@Repository
public class TodoDAOImpl implements TodoDAO {

	private static final String namespace = "org.test.mapper.TodoMapper";
	
	@Inject
	SqlSessionTemplate session;	
	
	@Override
	public void create(TodoVO todoVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TodoVO read(Integer todo_num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(TodoVO todoVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer todo_num) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TodoVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
