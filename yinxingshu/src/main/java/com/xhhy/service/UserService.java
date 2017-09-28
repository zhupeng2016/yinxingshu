package com.xhhy.service;

import com.xhhy.bean.RoleBean;
import com.xhhy.bean.UserBean;

public interface UserService {

	public UserBean login(String loginName,String password);
	
	public void update(int userId);
	
	public boolean  UpdateById(UserBean userId);

}
