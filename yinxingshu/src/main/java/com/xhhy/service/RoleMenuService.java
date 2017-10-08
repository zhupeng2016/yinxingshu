package com.xhhy.service;

import java.util.List;
import java.util.Set;

import com.xhhy.bean.MenuBean;
import com.xhhy.bean.RoleMenuBean;

public interface RoleMenuService {

	// 根据roleId得到对应菜单信息
	public List<MenuBean> getMenuList(int roleId);

	// 根据roleid物理删除对应的菜单。
	public boolean delete(int roleId);

	// 根据roleId添加菜单项
	public boolean addMenu(int roleId, List<Integer> ls);

	// 自动补全
	public Set<String> autoCompleteString();

}
