package org.test.model;

import java.util.Date;

public class TodoVO {

	private String todo;
	private String content;
	private Date enddate;
	private String endflag;
	
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
	
	public String getEndflag() {
		return endflag;
	}
	
	public void setEndflag(String endflag) {
		this.endflag = endflag;
	}

	@Override
	public String toString() {
		return "TodoVO [todo=" + todo + ", content=" + content + ", enddate=" + enddate + ", endflag=" + endflag + "]";
	}	
	
}
