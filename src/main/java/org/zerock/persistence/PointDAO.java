package org.zerock.persistence;

/**
 * SpringBoard 
 * 클래스명 : PointDAO.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 22.
 * 클래스 소개 : 사용자 포인트처리를 위한 인터페이스
 */
public interface PointDAO {

	public void updatePoint(String uid, int point) throws Exception;
}
