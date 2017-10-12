package com.xhhy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.xhhy.bean.MenuBean;
import com.xhhy.bean.UserBean;
import com.xhhy.service.RoleMenuService;
import com.xhhy.service.RoleService;

@Controller
@RequestMapping("home")
@SessionAttributes({"ml"})
public class HomeController {
	
	@Autowired
	private RoleMenuService rms;
	@Autowired
	private RoleService rs;
	
	@RequestMapping("/index")
	public String showMenu(Model m,HttpSession session){
		UserBean ub=(UserBean)session.getAttribute("ub");
		System.out.println(ub);
		System.out.println(ub.getUserId());
		//根据用户id得到对应 的roleid
		int roleId=rs.getRoleId(ub.getUserId());
		//根据roleid得到对应的菜单及菜单名称。。。
		List<MenuBean> ml=rms.getMenuList(roleId);
		m.addAttribute("ml",ml);
		return "/index.jsp";
	}
	

}
