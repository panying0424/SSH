package com.bill.entity;

import java.util.Date;

/**
 * 账单
 * @author PanYing
 *
 */
public class Bill {

	/** ID */
	private String b_Id;
	
	/** 交易时间 */
	private Date b_time;
	
	/** 描述 */
	private String b_describe;
	
	/** 交易金额 */
	private Double b_money;
	
	/** 交易后余额 */
	private Double b_balance;
	
	/** 账户 */
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
