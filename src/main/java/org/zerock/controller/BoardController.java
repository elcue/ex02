package org.zerock.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

/**
 * SpringBoard 
 * 클래스명 : BoardController.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : 등록 구현
 */
@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;
	
	/*
	 * GET 방식은 항상 사용자가 직접 브라우저에서 접근이 가능할 때 사용. ex) 입력페이지, 조회페이지
	 * 
	 * POST 방식은 항상 외부에서 많은 정보를 입력하는 경우에 사용. 브라우저상에서 주소창에 보여지면 안 되는 정보를 전송할 때.
	 */
	
	@RequestMapping(value ="/register", method=RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception{
		logger.info("register get.............................");
	}
	
	@RequestMapping(value ="/register", method=RequestMethod.POST)
	public String registerPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		logger.info("register post..............................");
		logger.info(board.toString());
		
		service.regist(board);
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value="/listAll", method=RequestMethod.GET)
	public void listAll(Model model) throws Exception{
		logger.info("show all list.............................");
		
		model.addAttribute("list", service.listAll());
	}
}
