package org.test.model;

import java.util.Date;

public class TodoVO {

	private Integer todo_num;
	private String todo;
	private String content;
	private Date enddate;
		
	public Integer getTodo_num() {
		return todo_num;
	}

	public void setTodo_num(Integer todo_num) {
		this.todo_num = todo_num;
	}

	public String getTodo() {
		return todo;
	}
	
	public void setTodo(String todo) {
		this.todo = todo;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getEnddate() {
		return enddate;
	}
	
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
		
	
}
