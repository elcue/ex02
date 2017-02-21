package org.zerock.domain;

/**
 * SpringBoard 
 * 클래스명 : Criteria.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : 파라미터가 많아지면 관리하기가 어렵기 때문에 클래스로 만들어서 객체로 처리하기 위한 클래스. 
 * 			  여기서는 페이징을 위한 파라미터 값들을 객체로 처리한다.
 */
public class Criteria {

	private int page;
	private int perPageNum;
	
	public Criteria(){
		this.page = 1;
		this.perPageNum = 10;
	}

	public void setPage(int page) {
		if(page <= 0){
			this.page = 1;
			return;
		}
		this.page = page;
	}
	
	public void setPerPageNum(int perPageNum) {
		if(perPageNum <= 0 || perPageNum > 100){
			this.perPageNum = 10;
			return;
		}
		this.perPageNum = perPageNum;
	}
	
	public int getPage() {
		return page;
	}
	//method for MyBatis SQL Mapper-
	public int getPageStart(){
		return (this.page - 1) * perPageNum;
	}

	public int getPerPageNum() {
		return this.perPageNum;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";
	}
	
}
