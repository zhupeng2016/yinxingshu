package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.bean.RoleBean;
import com.xhhy.service.RoleService;

@Controller
@RequestMapping("/rec")
public class RoleController {

	
	@Autowired
	private RoleService rs;
	@RequestMapping("/demo1")
	public String getRoles(Model m){
		List<RoleBean> list=rs.getRoles();
		if(list.size()!=0){
			
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i).getRoleKind());
			}
			m.addAttribute("list", list);
		}
		return "/zhaopin/demo1/list.jsp";
	}
}
