package com.bill.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.bill.entity.Account;
import com.bill.entity.Bill;
import com.bill.entity.User;

/**
 * 
 * @author PanYing
 *
 */
public class UserDao extends HibernateDaoSupport{

	public User chenkUser(User user) {
		
		Serializable uId = this.getHibernateTemplate().save(user);
		List<User> users = this.getHibernateTemplate().findByExample(user);
		
		Account account = new Account();
		account.setA_Name("支付宝");
		account.setA_Money(0.0);
		account.setA_Number("935412301@qq.com");
		account.setA_user(users.get(0));
		Serializable aId = this.getHibernateTemplate().save(account);
		List<Account> accounts = this.getHibernateTemplate().findByExample(account);
		Bill bill = new Bill();
		bill.setB_time(new Date());
		bill.setB_describe("永辉超市购买腊肠");
		bill.setB_money(1.0);
		bill.setB_balance(accounts.get(0).getA_Money()-bill.getB_money());
		bill.setB_account(accounts.get(0));
		
		Serializable bId = this.getHibernateTemplate().save(bill);
		
		System.out.println(uId);
		System.out.println(aId);
		System.out.println(bId);
		
		//System.out.println(users.get(0).getU_Id());
		return null;
	}

	
}
