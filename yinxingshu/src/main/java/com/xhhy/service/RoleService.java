package com.xhhy.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.RoleBean;

public interface RoleService {

	// 展现职位发布

	public PageInfo getRoles(int nowPage,int pageSize,int num);


	
	public  List<RoleBean> getRoles();


	// 查看职位信息
	public RoleBean getRole(Integer

	roleId);

	// 查看变更的信息(预修改)
	public RoleBean pupdateRole(Integer

	roleId);

	// 变更职位
	public boolean updateRole(RoleBean role);

	/*//预添加
	public List<RoleBean> paddRole();*/
	
	
	//添加职员发布数据
	public boolean addRole(RoleBean role);
	

	//删除职位
	public boolean deleteRole(Integer roleId);
	
	
	//根据用户id得到roleid
	
// -----葛大龙------------
	//得到所有职位信息
	public List<RoleBean> getAllRole(RoleBean rb);
	//根据用户id得到roleid
	public int getRoleId(int userId);
	//状态删除职位
	public boolean delRole(Integer roleId);
	//修改职位信息
	public boolean updateRoleBy(RoleBean rb);
	//添加职位信息
	public boolean addro(RoleBean rb);
	// 最大编号
	public String getMaxCode();

//得到id
	public int getIdByCode(String roleCode);


	
// -----葛大龙------------
	
}
