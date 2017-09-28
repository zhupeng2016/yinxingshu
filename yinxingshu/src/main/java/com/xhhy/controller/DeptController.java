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
	
	
	@RequestMapping("/deptList")
	public String showDept(Model m){
		
		List<DeptBean> deptlist=ds.getAllDept();
		m.addAttribute("deptlist",deptlist);
		return "/resource/demo1/ifm.jsp";
	}
	
	@RequestMapping("/add")
	public String addDept(Model m,DeptBean db){
		m.addAttribute("db",db);
		if(ds.addDept(db)){
			m.addAttribute("msg","添加成功。");
			}
		return "deptList";
	}

	@RequestMapping("/showDept/{deptId}")
	public String showDept(Model m,@PathVariable("deptId")int deptId){
		DeptBean db=ds.getDeptById(deptId);
		m.addAttribute("db",db);
		return "/resource/demo1/view.jsp";
	}
	
	@RequestMapping("/delete/{deptId}")
	public String deleteDept(Model m,@PathVariable("deptId")int deptId){
		if(ds.deleteDeptById(deptId)){
			m.addAttribute("msg","删除成功。");
		}
		return "/dept/deptList";
	}
	
	@RequestMapping("/pupdate/{deptId}")
	public String pupdateDept(Model m,@PathVariable("deptId")int deptId){
		DeptBean db=ds.getDeptById(deptId);
		m.addAttribute("db",db);
		return "/resource/demo1/update.jsp";
	}
	
	@RequestMapping("/update/{deptId}")
	public String updateDept(Model m,@PathVariable("deptId")int deptId,@RequestParam("db")DeptBean db){
		db.setDeptId(deptId);
		if(ds.updateDept(db)){
			m.addAttribute("msg","修改成功。");
		}
		return "/dept/deptList";
	}
}
