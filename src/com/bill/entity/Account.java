package com.bill.entity;

/**
 * �˻�
 * @author PanYing
 *
 */
public class Account {

	/** ID */
	private String a_Id;
	
	/** �˻����� */
	private String a_Name;
	
	/** �˻��˺�  */
	private String a_Number;
	
	/** �˻���� */
	private Double a_Money;
	
	/** �˻����û� */
	private User a_user;

	public String getA_Id() {
		return a_Id;
	}

	public void setA_Id(String a_Id) {
		this.a_Id = a_Id;
	}

	public String getA_Name() {
		return a_Name;
	}

	public void setA_Name(String a_Name) {
		this.a_Name = a_Name;
	}

	public String getA_Number() {
		return a_Number;
	}

	public void setA_Number(String a_Number) {
		this.a_Number = a_Number;
	}

	public Double getA_Money() {
		return a_Money;
	}

	public void setA_Money(Double a_Money) {
		this.a_Money = a_Money;
	}

	public User getA_user() {
		return a_user;
	}

	public void setA_user(User a_user) {
		this.a_user = a_user;
	}
	
}
