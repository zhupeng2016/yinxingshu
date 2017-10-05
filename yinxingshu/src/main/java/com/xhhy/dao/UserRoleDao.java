package com.xhhy.dao;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.xhhy.bean.UserBean;

@Repository
public interface UserRoleDao {
	
	//得到所有用户信息
	public List<UserBean> getAllUsers(UserBean userBean);
	//通过用户id得到用户的所有信息。
	public UserBean getUserById(int userId);
	//状态删除用户
	public boolean delete(int userId);
	//修改用户信息
	public boolean update(UserBean ub);
	//添加用户
	public boolean add(UserBean ub);
	//用户最大编号。
	public String getMaxCode();
	//唯一验证
	public UserBean getUserByName(@Param("ln")String loginName);
	//自动补全
	public Set<String> autoCompleteString();
	
}
