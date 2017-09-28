package com.xhhy.service;

import java.util.List;

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

}
