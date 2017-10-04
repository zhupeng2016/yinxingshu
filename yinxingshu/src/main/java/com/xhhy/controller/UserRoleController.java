package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.bean.DeptBean;
import com.xhhy.bean.RoleBean;
import com.xhhy.bean.UserBean;
import com.xhhy.service.DeptService;
import com.xhhy.service.RoleService;
import com.xhhy.service.UserRoleService;

@Controller
@RequestMapping("user")
public class UserRoleController {
	
	@Autowired
	private UserRoleService urs;
	@Autowired
	private DeptService ds;
	@Autowired
	private RoleService rs;
	
	
	@RequestMapping("/userlist")
	public String getAllUsers(Model m){
		List<UserBean> userlist=urs.getAllUsers();
//		System.out.println(userlist.get(0).getDb().getDeptName());
		m.addAttribute("uls",userlist);
		return "/resource/demo2/list.jsp";
	}
	
	@RequestMapping("/delete")
	public String delete(Model m,int userId){
		if(urs.delete(userId)){
			m.addAttribute("msg","删除成功。");
		}else{
			m.addAttribute("msg","删除失败。");
		}
		return "userlist";
	}

	@RequestMapping("/look")
	public String look(Model m,int userId){
		UserBean ub=urs.getUserById(userId);
		m.addAttribute("ub",ub);
		return "/resource/demo2/view.jsp";
	}
	
	@RequestMapping("/pupdate")
	public String pupdate(Model m,int userId){
		UserBean ub=urs.getUserById(userId);
		m.addAttribute("user",ub);
		//所有部门
		List<DeptBean> dls=ds.getAllDept();
		m.addAttribute("dls",dls);
		//所有职位
		List<RoleBean> rls=rs.getRoles();
		m.addAttribute("rls",rls);
		return "/resource/demo2/update.jsp";
	}
	
	@RequestMapping("/update")
	public String update(Model m,int userId,UserBean ub){
		ub.setUserId(userId);
		if(urs.update(ub)){
			m.addAttribute("msg","修改成功。");
		}else{
			m.addAttribute("msg","修改失败。");
		}
		return "userlist";
	}
}
