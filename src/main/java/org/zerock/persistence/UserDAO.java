package org.zerock.persistence;

import java.util.Date;

import org.zerock.domain.UserVO;
import org.zerock.dto.LoginDTO;

/**
 * SpringBoard 
 * 클래스명 : UserDAO.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 24.
 * 클래스 소개 : 로그인 인터페이스
 */
public interface UserDAO {
	
	public UserVO login(LoginDTO dto) throws Exception;
	
	//로그인한 사용자의 세션키, 세션유지, 로그인쿠키 기록값조회
	
	public void keepLogin(String uid, String sessionId, Date next);
	
	public UserVO checkUserWithSessionKey(String value);
	
}
