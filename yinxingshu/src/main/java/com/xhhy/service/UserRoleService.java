package com.xhhy.service;

import java.util.List;

import com.xhhy.bean.UserBean;
import com.xhhy.bean.UserRoleBean;

public interface UserRoleService {
	
	//得到所有用户信息
	public List<UserBean> getAllUsers();
	//通过用户id得到用户的所有信息。
		public UserBean getUserById(int userId);
		//状态删除用户
		public boolean delete(int userId);
		//修改用户信息
		public boolean update(UserBean ub);
		
}
