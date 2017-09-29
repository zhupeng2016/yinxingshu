package com.xhhy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.xhhy.bean.MenuBean;


@Repository
public interface RoleMenuDao {
	
	 //根据roleId得到对应菜单信息
	public List<MenuBean> getMenuList(int roleId);
	//根据roleid物理删除对应的菜单。
	public boolean delete(int roleId);
	//根据roleId添加菜单项
	public boolean addMenu(@Param("roleId")int roleId, @Param("ls")List<Integer> ls);
	
	

}
