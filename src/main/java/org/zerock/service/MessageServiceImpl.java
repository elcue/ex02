package org.zerock.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.MessageVO;
import org.zerock.persistence.MessageDAO;
import org.zerock.persistence.PointDAO;

/**
 * SpringBoard 
 * 클래스명 : MessageServiceImpl.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 22.
 * 클래스 소개 : messageservice 구현 클래스
 */
@Service
public class MessageServiceImpl implements MessageService{

	@Inject	private MessageDAO messageDAO;
	@Inject private PointDAO pointDAO;
	

	@Override
	public void addMessage(MessageVO vo) throws Exception {
		// TODO Auto-generated method stub
		messageDAO.create(vo);
		pointDAO.updatePoint(vo.getSender(), 10);
	}
	@Override
	public MessageVO readMessage(String uid, Integer mid) throws Exception {
		// TODO Auto-generated method stub
		messageDAO.updateState(mid);
		pointDAO.updatePoint(uid, 5);
		
		return messageDAO.readMessage(mid);
	}

}
