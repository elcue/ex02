package org.zerock.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDAO;

/**
 * SpringBoard 
 * 클래스명 : BoardDAOTest.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : BoardDAOTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardDAOTest {
	@Inject
	private BoardDAO dao;
	
	@Test
	public void testCreate() throws Exception{
		BoardVO board = new BoardVO();
		board.setTitle("새로운 글을 넣습니다.");
		board.setContent("새로운 글을 넣습니다.");
		board.setWriter("user00");
		dao.create(board);
	}
	
	@Test
	public void testUpdate() throws Exception{
		BoardVO board = new BoardVO();
		
		board.setBno(2);
		board.setTitle("수정된 글 입니다.");
		board.setContent("수정 테스트");
		dao.update(board);
	}
	
	@Test
	public void testDelete() throws Exception{
		dao.delete(2);
	}
}
