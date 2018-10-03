package org.test.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.test.dao.UserDAO;
import org.test.model.UserVO;

@Controller
public class RegisterController {

	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
	
	@Autowired
	UserDAO dao;
	
	//회원등록
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register() {
		logger.info("/register get called...");
		
		return "registerForm";
	}
	
	//회원 비밀번호 입력이 같을시 등록 성공	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	@ResponseBody
	public String registerProc(UserVO userVO, String pw1, String pw2) {
		
		logger.info("/register post called: " + userVO);
				
		if (pw1.length() > 0 && pw1.equals(pw2)) {
			userVO.setPassword(pw1);
			logger.info("uservo: " + userVO + "(" + pw1 + ", " + pw2 +")");
			
			try {
				dao.create(userVO);;
				return "success";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "fail2";
			}
			
		} else {
			logger.info("register post: pw incorrect");
			return "fail";
		}

	}
	
	//회원정보 리스트
	@RequestMapping(value="/list", method=RequestMethod.GET) 
	public String list(Model model) {
		List<UserVO> list = null;
		try {
			list = dao.listAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		model.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(Integer user_num, Model model) {
		logger.info("update get: id=" + user_num);
		UserVO userVO = null;
		try {
			userVO = dao.read(user_num);
			model.addAttribute("userVO", userVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "updateForm";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseBody
	public String updateProc(UserVO userVO) {
		logger.info("update post: userVO=" + userVO);
		
		try {
			if (dao.update(userVO)) {
				return "success";
			} else {
				return "fail";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "fail2";
	}
	
}
