package com.xhhy.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.xhhy.bean.DeptBean;
import com.xhhy.service.DeptService;

@RequestMapping("/dept")
@Controller
@SessionAttributes({"deptlist"})
public class DeptController {
	
	@Autowired
	private DeptService ds;
	
	
	@RequestMapping("/deptlist")
	public String showDept(Model m){
		
		List<DeptBean> deptlist=ds.getAllDept();
		m.addAttribute("deptlist",deptlist);
		return "/resource/demo1/list.jsp";
	}
	
	@RequestMapping("/add")
	public String addDept(Model m,DeptBean db){
		m.addAttribute("db",db);
		ds.addDept(db);
		return "deptlist";
	}

	@RequestMapping("/showDept/{deptId}")
	public String showDept(Model m,@PathVariable("deptId")int deptId){
		DeptBean db=ds.getDeptById(deptId);
		m.addAttribute("db",db);
		return "resource/demo1/view.html";
	}
	
	
}
