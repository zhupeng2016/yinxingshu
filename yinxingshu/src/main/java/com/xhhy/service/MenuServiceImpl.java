package com.xhhy.service;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhhy.bean.MenuBean;
import com.xhhy.dao.MenuDao;


@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuDao md;
	

	//查询所有菜单项。
	public List<MenuBean> getAllMenu() {
		// TODO Auto-generated method stub
		return md.getAllMenu();
	}

	 //根据菜单Id状态删除菜单
	public boolean deleteMenu(String menuId) {
		// TODO Auto-generated method stub
		return md.deleteMenu(menuId);
	}
	//根据菜单Id查询菜单信息
	public MenuBean getMenuById(String menuId) {
		// TODO Auto-generated method stub
		return md.getMenuById(menuId);
	}
	//根据菜单Id修改菜单信息
	public boolean updateMenu(MenuBean mb) {
		// TODO Auto-generated method stub
		return md.updateMenu(mb);
	}
	//添加新菜单

	public boolean addMenu(MenuBean mb) {
		// TODO Auto-generated method stub
		return md.addMenu(mb);
	}
	//模糊查询
	public List<MenuBean> getAllMenu(MenuBean mb) {
		// TODO Auto-generated method stub
		return md.getAllMenu(mb);
	}
   //自动填充

	public Set<String> autoCompleteString() {
		// TODO Auto-generated method stub
		return md.autoCompleteString();
	}


	public List<MenuBean> getMenus() {
		// TODO Auto-generated method stub
		return md.getMenus();
	}
	
	
	

	
}
