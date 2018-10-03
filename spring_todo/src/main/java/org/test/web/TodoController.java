package org.test.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.test.dao.TodoDAO;

@Controller
public class TodoController {

	private static final Logger logger = LoggerFactory.getLogger(TodoController.class);
	
	@Autowired
	TodoDAO dao;
	
	
	
}
