package com.bill.service;

import com.bill.dao.UserDao;
import com.bill.entity.User;

/**
 * �û��������
 * @author PanYing
 *
 */
public class UserService {

	private UserDao userDao;
	
	public User loginUser(User user) {
		return userDao.chenkUser(user);
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
