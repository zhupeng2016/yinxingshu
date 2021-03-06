package com.xhhy.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhhy.bean.MenuBean;
import com.xhhy.bean.RoleMenuBean;
import com.xhhy.dao.RoleMenuDao;

@Service
public class RoleMenuServiceImpl implements RoleMenuService {

	@Autowired
	private RoleMenuDao rmd;
	
	 //根据roleId得到对应菜单信息
	
	public List<MenuBean> getMenuList(int roleId) {
		// TODO Auto-generated method stub
		return rmd.getMenuList(roleId);
	}
	//根据roleid物理删除对应的菜单。

	public boolean delete(int roleId) {
		// TODO Auto-generated method stub
		return rmd.delete(roleId);
	}
	//根据roleId添加菜单项
	
	public boolean addMenu(int roleId, List<Integer> ls) {
		// TODO Auto-generated method stub
		return rmd.addMenu(roleId,ls);
	}
	//自动补全

	public Set<String> autoCompleteString() {
		// TODO Auto-generated method stub
		return rmd.autoCompleteString();
	}
	
}
