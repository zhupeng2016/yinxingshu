package com.xhhy.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhhy.bean.RoleBean;
import com.xhhy.bean.UserBean;
import com.xhhy.dao.UserRoleDao;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private UserRoleDao urd;
	
	//得到所有用户信息
	@Override
	public List<UserBean> getAllUsers(UserBean userBean) {
		// TODO Auto-generated method stub
		return urd.getAllUsers(userBean);
	}

	//通过用户id得到用户的所有信息。
		public UserBean getUserById(int userId) {
			// TODO Auto-generated method stub
			return urd.getUserById(userId);
		}

		//状态删除用户
		public boolean delete(int userId) {
			// TODO Auto-generated method stub
			return urd.delete(userId);
		}
		
		//修改用户信息
		@Override
		public boolean update(UserBean ub) {
			// TODO Auto-generated method stub
			return urd.update(ub);
		}
		//添加用户
		@Override
		public boolean add(UserBean ub) {
			// TODO Auto-generated method stub
			return urd.add(ub);
		}
		//用户最大编号。
		@Override
		public String getMaxCode() {
			// TODO Auto-generated method stub
			return urd.getMaxCode();
		}
		//唯一验证
		@Override
		public UserBean getUserByName(String loginName) {
			// TODO Auto-generated method stub
			return urd.getUserByName(loginName);
		}
		//自动补全
		@Override
		public Set<String> autoCompleteString() {
			// TODO Auto-generated method stub
			return urd.autoCompleteString();
		}
		//部门改变，职位改变。。

		@Override
		public List<RoleBean> getRoleByDetp(int deptId) {
			// TODO Auto-generated method stub
			return urd.getRoleByDetp(deptId);
		}
		
}
