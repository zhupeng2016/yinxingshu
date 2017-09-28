package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.bean.ResumeBean;
import com.xhhy.bean.RoleBean;
import com.xhhy.service.ResumeService;
import com.xhhy.service.RoleService;
import com.xhhy.service.UserService;

@Controller
@RequestMapping("res")
public class ResumeController {
	
	@Autowired
	private ResumeService rss;
	@Autowired
	private RoleService rs;
	
	@Autowired
	private UserService us;
	
	@RequestMapping("/eg")
	public String getResume(Model m ,Integer roleId){
		RoleBean role = rs.getRole(roleId);
		m.addAttribute("role", role);
		List<ResumeBean> resumeList=rss.getResume();
		for (ResumeBean resumeBean : resumeList) {
			System.out.println(resumeBean.getRole().get(0).getRoleName());
		}
		m.addAttribute("resumeList", resumeList);
		return "/zhaopin/demo2/list.jsp";
	}
	

}
