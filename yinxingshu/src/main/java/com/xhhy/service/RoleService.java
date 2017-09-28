package com.xhhy.service;

import java.util.List;

import com.xhhy.bean.RoleBean;

public interface RoleService {

	public List<RoleBean> getRoles();
    //根据用户id得到roleid
	public int getRoleId(int userId);
	
}
