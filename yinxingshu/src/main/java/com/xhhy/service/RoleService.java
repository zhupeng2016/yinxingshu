package com.xhhy.service;

import java.util.List;

import com.xhhy.bean.RoleBean;

public interface RoleService {

	// 展现职位发布
	public List<RoleBean> getRoles();

	// 查看职位xinx
	public RoleBean getRole(Integer

	roleId);

	// 查看变更的信息(预修改)
	public RoleBean pupdateRole(Integer

	roleId);

	// 变更职位
	public boolean updateRole(Integer

	roleId, String roleNum, String roleRemark, String

	roleRequired);

	/*//预添加
	public List<RoleBean> paddRole();*/
	
	
	//添加职员发布数据
	public boolean addRole(RoleBean role);
}
