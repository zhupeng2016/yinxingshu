package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhhy.bean.RoleBean;
import com.xhhy.dao.RoleDao;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao rd;
	
	public List<RoleBean> getRoles() {
		// TODO Auto-generated method stub
		return rd.getRoles();
	}
    //根据用户id得到roleid
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
	public boolean updateRole(Integer roleId, String

	roleNum, String roleRemark, String roleRequired) {
		// TODO Auto-generated method stub
		return rd.updateRole

		(roleId, roleNum, roleRemark, roleRequired);
	}

	
	/*//预添加
	@Override
	public List<RoleBean> paddRole() {
		// TODO Auto-generated method stub
		return rd.paddRole();
	}*/
	
	
	//添加职位信息
	public boolean addRole(RoleBean role) {
		// TODO Auto-generated method stub
		return rd.addRole(role);
	}


	//删除职位
	public boolean deleteRole(Integer roleId) {
		// TODO Auto-generated method stub
		return rd.deleteRole(roleId);
	}
}
