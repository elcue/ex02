package org.zerock.domain;

/**
 * SpringBoard 
 * 클래스명 : UserVO.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 22.
 * 클래스 소개 : User 객체
 */
public class UserVO {

	private String uid;
	private String upw;
	private String uname;
	private int upoind;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUpoind() {
		return upoind;
	}
	public void setUpoind(int upoind) {
		this.upoind = upoind;
	}
	@Override
	public String toString() {
		return "UserVO [uid=" + uid + ", upw=" + upw + ", uname=" + uname + ", upoind=" + upoind + "]";
	}
	
	
}
