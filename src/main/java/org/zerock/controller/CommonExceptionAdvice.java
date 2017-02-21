package org.zerock.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * SpringBoard 
 * 클래스명 : CommonExceptionAdvice.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : 예외 처리를 위한 클래스.
 */

@ControllerAdvice
public class CommonExceptionAdvice {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonExceptionAdvice.class);
	
	@ExceptionHandler(Exception.class)
	private ModelAndView errorModelAndView(Exception ex){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/error_common");
		modelAndView.addObject("exception", ex);
		
		return modelAndView;
	}
}
