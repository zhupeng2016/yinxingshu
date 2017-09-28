package com.xhhy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xhhy.bean.RoleBean;

@Repository
public interface RoleDao {

	public List<RoleBean> getRoles();
	//根据用户id得到roleid
	public int getRoleId(int userId);
	
}
