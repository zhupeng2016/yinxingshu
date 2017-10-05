package com.xhhy.service;


import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.xhhy.bean.MenuBean;

@Repository
public interface MenuService {
	//查询所有菜单项。
	public List<MenuBean> getAllMenu();
    //根据菜单Id状态删除菜单
	public boolean deleteMenu(String menuId);
	//根据菜单Id查询菜单信息
	public MenuBean getMenuById(String menuId);
	//根据菜单Id修改菜单信息
	public boolean updateMenu(MenuBean mb);
	//添加新菜单
	public boolean addMenu(MenuBean mb);
	//模糊查询
	public List<MenuBean> getAllMenu(MenuBean mb);
	/*//自动填充
	public Set<String> autoComplete(String str);*/
	public List<MenuBean> getMenus();

}
