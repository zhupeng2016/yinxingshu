package com.xhhy.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.xhhy.util.State;
import com.xhhy.bean.DeptBean;
import com.xhhy.bean.MenuBean;
import com.xhhy.bean.RoleBean;
import com.xhhy.service.DeptService;
import com.xhhy.service.MenuService;
import com.xhhy.service.RoleMenuService;
import com.xhhy.service.RoleService;
@Controller
@RequestMapping("/rec")

public class RoleController {

	// 展现职位发布列表
	@Autowired
	private RoleService rs;
	@Autowired
	private DeptService ds;
	
	@RequestMapping("/demo1")
	public String getRoles(Integer pageNum,Model map) {
		if(pageNum==null){
			pageNum=1;
		}
		PageInfo page=rs.getRoles(pageNum,State.PAGESIZE,State.NUM);
		List<RoleBean> roleList = page.getList();
		
		map.addAttribute("roleList", roleList);
        map.addAttribute("page",page); 
		return "/zhaopin/demo1/list.jsp";
	}

	// 查看职员信息
	@RequestMapping("/view")
	public String getRole(Model m, Integer roleId) {
		RoleBean role = rs.getRole(roleId);
		m.addAttribute("role", role);
		return "/zhaopin/demo1/view.jsp";
	}

	// 查看变更信息
	@RequestMapping("/viewtwo")
	public String pupdateRole(Model m, Integer roleId) {
		RoleBean role = rs.getRole(roleId);
		List<DeptBean> dept=ds.getAllDept();
		m.addAttribute("dept", dept);
		m.addAttribute("role", role);
		return "/zhaopin/demo1/edit.jsp";
	}

	// 变更职员信息
	@RequestMapping("/edit")
	public String updateRole(Model m, RoleBean role) {
		/*
		 * role.setRoleId(roleId); //role.setDeptId(deptId);
		 * role.setRoleCode(roleCode); role.setRoleName(roleName);
		 */
		System.out.println(role);
		boolean b = rs.updateRole(role);
		if (b) {
			return "/rec/demo1";
		} else {
			return "/zhaopin/demo1/edit.jsp";
		}

	}

	// 预添加
	@RequestMapping("/padd")
	public String paddRole(Model m) {
		List<DeptBean> role = ds.getAllDept();
		for (DeptBean d : role) {
			System.out.println(d.toString());
		}
		m.addAttribute("role", role);
		return "/zhaopin/demo1/add.jsp";
	}

	//添加职位
	@RequestMapping("/add")
	public String addRole(RoleBean role, Model m) {
		Boolean is = rs.addRole(role);
		if (!is) {
			m.addAttribute("role", role);
			return "/zhaopin/demo1/add.jsp";
		} else {
			return "rec/demo1";
		}
	}

	}

