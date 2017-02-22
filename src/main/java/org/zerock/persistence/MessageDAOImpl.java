package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MessageVO;

/**
 * SpringBoard 
 * 클래스명 : MessageDAOImpl.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 22.
 * 클래스 소개 : messagedao 구현 클래스
 */
@Repository
public class MessageDAOImpl implements MessageDAO{

	@Inject
	private SqlSession session;
	
	private static String namespace ="org.zerock.mapper.MessageMapper";
	
	@Override
	public void create(MessageVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".create", vo);
		
	}

	@Override
	public MessageVO readMessage(Integer mid) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".readMessage", mid);
	}

	@Override
	public void updateState(Integer mid) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace+".updateState", mid);
	}

}
