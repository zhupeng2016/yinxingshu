package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhhy.bean.RoleBean;
import com.xhhy.dao.RoleDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhhy.bean.RoleBean;
import com.xhhy.dao.RoleDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao rd;


	public List<RoleBean> getRoles() {
		// TODO Auto-generated method stub
		return rd.getRoles();
	}

	public PageInfo getRoles(int pageNum, int pageSize, int num) {
		List<RoleBean> l = null;
		PageInfo<Object> info = null;
		PageHelper.startPage(pageNum, pageSize);
		l = rd.getRoles();
		info = new PageInfo(l, num);
		int c = info.getPages();
		if (pageNum > c) {
			PageHelper.startPage(c, pageSize);
			l = rd.getRoles();
			info = new PageInfo(l, num);
		}
		return info;
	}

	// 查看职位信息
	public RoleBean getRole(Integer roleId) {
		// TODO Auto-generated method stub
		return rd.getRole(roleId);
	}

	// 查看变更信息(预修改)
	public RoleBean pupdateRole(Integer roleId) {
		// TODO Auto-generated method stub
		return rd.pupdateRole(roleId);
	}

	//修改职位发布信息
	public boolean updateRole(RoleBean role) {

		return rd.updateRole(role);
	}

	/*
	 * //预添加
	 * 
	 * @Override public List<RoleBean> paddRole() { // TODO Auto-generated
	 * method stub return rd.paddRole(); }
	 */

	// 添加职位信息
	public boolean addRole(RoleBean role) {
		// TODO Auto-generated method stub
		return rd.addRole(role);
	}

// -----葛大龙------------
	// 根据用户id得到roleid

	public int getRoleId(int userId) {
		// TODO Auto-generated method stub
		return rd.getRoleId(userId);
	}

	
	
	


	// 状态删除职位
	public boolean delRole(Integer roleId) {
		// TODO Auto-generated method stub
		return rd.delRole(roleId);
	}

	// 修改职位信息
	public boolean updateRoleBy(RoleBean rb) {
		// TODO Auto-generated method stub
		return rd.updateRoleBy(rb);
	}

	// 得到所有职位信息
	public List<RoleBean> getAllRole(RoleBean rb) {
		// TODO Auto-generated method stub
		return rd.getAllRole(rb);
	}

	// 添加职位信息

	public boolean addro(RoleBean rb) {
		// TODO Auto-generated method stub
		return rd.addro(rb);
	}
	// 最大编号


	public String getMaxCode() {
		// TODO Auto-generated method stub
		return rd.getMaxCode();
	}
	//得到id

	public int getIdByCode(String roleCode) {
		// TODO Auto-generated method stub
		return rd.getIdByCode(roleCode);
	}

	@Override
	public boolean deleteRole(Integer roleId) {
		// TODO Auto-generated method stub
		return rd.deleteRole(roleId);
	}
	
	
// -----葛大龙------------

}
