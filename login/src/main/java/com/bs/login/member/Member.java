package com.bs.login.member;

public class Member {
	private String id;
	private String pw;
	private String mail;
	private int purcNum;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getPurcNum() {
		return purcNum;
	}
	public void setPurcNum(int purcNum) {
		this.purcNum = purcNum;
	}

	
}