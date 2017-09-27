package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.bean.ResumeBean;
import com.xhhy.service.ResumeService;

@Controller
@RequestMapping("res")
public class ResumeController {
	
	@Autowired
	private ResumeService rss;
	@RequestMapping("/eg")
	public String getResume(Model m){
		List<ResumeBean> resumeList=rss.getResume();
		m.addAttribute("resumeList", resumeList);
		return "/zhaopin/demo2/list.jsp";
	}
	

}
