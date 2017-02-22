package org.zerock.domain;

/**
 * SpringBoard 
 * 클래스명 : SampleVO.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 22.
 * 클래스 소개 : 별도의 처리 없이 자동으로 JSON처리하는 @RestController 연습
 */
public class SampleVO {
	
	private Integer mno;
	private String firstName;
	private String lastName;
	
	public Integer getMno() {
		return mno;
	}
	public void setMno(Integer mno) {
		this.mno = mno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "SampleVO [mno=" + mno + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}
