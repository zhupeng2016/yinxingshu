package com.xhhy.service;

import java.util.List;

import com.xhhy.bean.MenuBean;
import com.xhhy.bean.RoleMenuBean;


public interface RoleMenuService {
	
     //根据roleId得到对应菜单信息
		public List<MenuBean> getMenuList(int roleId);

		
}
