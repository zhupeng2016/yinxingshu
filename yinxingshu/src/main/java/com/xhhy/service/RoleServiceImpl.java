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
	
	public PageInfo getRoles(int pageNum,int pageSize,int num) {
		// TODO Auto-generated method stub
		
		List<RoleBean> l = null;
		PageInfo<Object> info = null;
		PageHelper.startPage(pageNum, pageSize);
		l=rd.getRoles();
		info=new PageInfo(l,num);
		int c = info.getPages();
		if(pageNum > c){
			PageHelper.startPage(c, 

pageSize);
			l = rd.getRoles();
			info = new PageInfo(l,num);
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

	
	
// -----葛大龙------------
	 //根据用户id得到roleid
		@Override
		public int getRoleId(int userId) {
			// TODO Auto-generated method stub
			return rd.getRoleId(userId);
		}

	//状态删除职位
	public boolean deleteRole(Integer roleId) {
		// TODO Auto-generated method stub
		return rd.deleteRole(roleId);
	}

	//修改职位信息
	
	public boolean updateRoleBy(RoleBean rb) {
		// TODO Auto-generated method stub
		return rd.updateRoleBy(rb);
	}

public List<RoleBean> getRoles() {
	// TODO Auto-generated method stub
	return null;
}
	
// -----葛大龙------------	
	

	
}
