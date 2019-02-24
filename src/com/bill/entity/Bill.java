package com.bill.entity;

import java.util.Date;

/**
 * �˵�
 * @author PanYing
 *
 */
public class Bill {

	/** ID */
	private String b_Id;
	
	/** ����ʱ�� */
	private Date b_time;
	
	/** ���� */
	private String b_describe;
	
	/** ���׽�� */
	private Double b_money;
	
	/** ���׺���� */
	private Double b_balance;
	
	/** �˻� */
	private Account b_account;

	public String getB_Id() {
		return b_Id;
	}

	public void setB_Id(String b_Id) {
		this.b_Id = b_Id;
	}

	public Date getB_time() {
		return b_time;
	}

	public void setB_time(Date b_time) {
		this.b_time = b_time;
	}

	public String getB_describe() {
		return b_describe;
	}

	public void setB_describe(String b_describe) {
		this.b_describe = b_describe;
	}

	public Double getB_money() {
		return b_money;
	}

	public void setB_money(Double b_money) {
		this.b_money = b_money;
	}

	public Double getB_balance() {
		return b_balance;
	}

	public void setB_balance(Double b_balance) {
		this.b_balance = b_balance;
	}

	public Account getB_account() {
		return b_account;
	}

	public void setB_account(Account b_account) {
		this.b_account = b_account;
	}
	
}
