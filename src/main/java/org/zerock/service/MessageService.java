package org.zerock.service;

import org.zerock.domain.MessageVO;

/**
 * SpringBoard 
 * 클래스명 : MessageService.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 22.
 * 클래스 소개 : message 서비스 수행 인터페이스
 */
public interface MessageService {

	public void addMessage(MessageVO vo) throws Exception;
	
	public MessageVO readMessage(String uid, Integer mid) throws Exception;
}
