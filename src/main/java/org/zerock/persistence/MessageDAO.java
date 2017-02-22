package org.zerock.persistence;

import org.zerock.domain.MessageVO;

/**
 * SpringBoard 
 * 클래스명 : MessageDAO.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 22.
 * 클래스 소개 : message 인터페이. 메시지 등록, 수정, 업데이트만 구현.
 */
public interface MessageDAO {

	public void create(MessageVO vo) throws Exception;
	
	public MessageVO readMessage(Integer mid) throws Exception;
	
	public void updateState(Integer mid) throws Exception;
}
