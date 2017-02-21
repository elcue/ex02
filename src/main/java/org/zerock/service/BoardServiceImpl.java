package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDAO;

/**
 * SpringBoard 
 * 클래스명 : BoardServiceImpl.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : Service 인터페이스의 구현 클래스
 */

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO dao;

	@Override
	public void regist(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		dao.create(board);	
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		dao.update(board);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}
}
