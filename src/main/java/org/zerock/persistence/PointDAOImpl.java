package org.zerock.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * SpringBoard 
 * 클래스명 : PointDAOImpl.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 22.
 * 클래스 소개 : pointdao 구현 클래스
 */
@Repository
public class PointDAOImpl implements PointDAO {

	@Inject
	private SqlSession session;
	
	private static final String namespace="org.zerock.mapper.PointMapper";
	
	@Override
	public void updatePoint(String uid, int point) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("uid", uid);
		paramMap.put("point", point);
		
		session.update(namespace+".updatePoint", paramMap);
		
	}

}
