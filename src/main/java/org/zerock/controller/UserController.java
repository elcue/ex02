package org.zerock.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.domain.UserVO;
import org.zerock.dto.LoginDTO;
import org.zerock.service.UserService;

/**
 * SpringBoard 
 * 클래스명 : UserController.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 24.
 * 클래스 소개 : 컨트롤러는 순수하게 데이터만 만들어 냄. 인터셉터를 이용해서 HttpSession을 처리.
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Inject private UserService service;
	
	@RequestMapping(value ="/login", method = RequestMethod.GET)
	public void loginGET(@ModelAttribute("dto") LoginDTO dto){
		
	}
	
	@RequestMapping(value="/loginPost", method=RequestMethod.POST)
	public void loginPOST(LoginDTO dto, HttpSession session, Model model) throws Exception{
		UserVO vo = service.login(dto);
		
		if(vo == null){
			return;
		}
		model.addAttribute("userVO", vo);
	}
	

}
