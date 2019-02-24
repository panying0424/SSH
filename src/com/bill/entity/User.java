package com.bill.entity;

/**
 * 用户
 * @author PanYing
 *
 */
public class User {

	/** 用户ID */
	private String u_Id;
	
	/** 用户名 */
	private String u_UserName;
	
	/** 用户密码 */
	private String u_PassWord;

	public String getU_Id() {
		return u_Id;
	}

	public void setU_Id(String u_Id) {
		this.u_Id = u_Id;
	}

	public String getU_UserName() {
		return u_UserName;
	}

	public void setU_UserName(String u_UserName) {
		this.u_UserName = u_UserName;
	}

	public String getU_PassWord() {
		return u_PassWord;
	}

	public void setU_PassWord(String u_PassWord) {
		this.u_PassWord = u_PassWord;
	}
	
}
