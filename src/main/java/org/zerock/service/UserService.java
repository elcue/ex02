package org.zerock.service;

import org.zerock.domain.UserVO;
import org.zerock.dto.LoginDTO;

/**
 * SpringBoard 
 * 클래스명 : UserService.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 24.
 * 클래스 소개 : 로그인 서비스 인터페이스
 */
public interface UserService {
	
	public UserVO login(LoginDTO dto) throws Exception;
}
