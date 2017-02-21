package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

/**
 * SpringBoard 
 * 클래스명 : BoardService.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : 비즈니스 계층 인터페이스
 */
public interface BoardService {

	public void regist(BoardVO board) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public void modify(BoardVO board) throws Exception;
	
	public void remove(Integer bno) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
}
