package com.xhhy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xhhy.bean.MenuBean;
import com.xhhy.bean.RoleMenuBean;


@Repository
public interface RoleMenuDao {
	
	 //根据roleId得到对应菜单信息
	public List<MenuBean> getMenuList(int roleId);
	//根据roleid物理删除对应的菜单。
	public boolean delete(int roleId);
	//根据roleId添加菜单项
	public boolean addMenu(int roleId, List<Integer> ls);
	
	

}
