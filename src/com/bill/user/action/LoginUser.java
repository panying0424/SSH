package com.bill.user.action;

import com.bill.entity.User;
import com.bill.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ÓÃ»§µÇÂ¼Action
 * @author PanYing
 *
 */
public class LoginUser extends ActionSupport{

	private UserService userService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		User user = new User();
		user.setU_PassWord("B");
		user.setU_UserName("A");
		User u = userService.loginUser(user);
		//System.out.println(u.getU_Id());
		
		return NONE;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
