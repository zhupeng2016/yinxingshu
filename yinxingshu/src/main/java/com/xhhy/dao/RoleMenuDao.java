package com.xhhy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xhhy.bean.MenuBean;
import com.xhhy.bean.RoleMenuBean;


@Repository
public interface RoleMenuDao {
	
	 //根据roleId得到对应菜单信息
	public List<MenuBean> getMenuList(int roleId);
	
	

}
