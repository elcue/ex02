package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

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
	
	//페이징 처리를 위한 ListPage
	public List<BoardVO> listPage(int page) throws Exception;
	
	//페이징에 필요한 startNum과 PageNum을 가져오기 위함.
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	//totalCount를 반환할 수 있게 처리하기 위함.
	public int countPaging(Criteria cri) throws Exception;

}
