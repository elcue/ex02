package org.zerock.persistence;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.UserVO;
import org.zerock.dto.LoginDTO;

/**
 * SpringBoard 
 * 클래스명 : UserDAOImpl.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 24.
 * 클래스 소개 : 로그인 구현 클래스
 */
@Repository
public class UserDAOImpl implements UserDAO{

	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.UserMapper";
	
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".login", dto);
	}


	@Override
	public void keepLogin(String uid, String sessionId, Date next) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("uid", uid);
		paramMap.put("sessionId", sessionId);
		paramMap.put("next", next);
		
		session.update(namespace+".keepLogin", paramMap);
	}


	@Override
	public UserVO checkUserWithSessionKey(String value) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".checkUserWithSessionKey", value);
	}
	

}
