package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.BoardVO;

/**
 * SpringBoard 
 * 클래스명 : BoardDAO.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : board 인터페이스
 */
public interface BoardDAO {
	
	public void create(BoardVO vo) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;

}
