package org.test.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.test.dao.TodoDAO;

@Controller
public class TodoController {

	private static final Logger logger = LoggerFactory.getLogger(TodoController.class);
	
	@Inject
	private TodoDAO dao;
	
	
	
}
