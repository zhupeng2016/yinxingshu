package com.xhhy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.SalaryBean;
import com.xhhy.service.SalaryManagerService;
import com.xhhy.util.State;

/**
 * 
 * @author 强悦
 * 薪酬标准管理controller层
 */
@Controller
@RequestMapping("/salary")
public class SalaryManagerController {
	
	@Autowired
	private SalaryManagerService salaryManagerService;
	
	/**
	 * 展现所有并分页
	 * @param pageNum
	 * @param map
	 * @return
	 */
	@RequestMapping("/findAll")
	public String findAll(int pageNum,Model map){
		PageInfo page = salaryManagerService.getSalarys(pageNum,State.PAGESIZE,State.NUM);
		//page.getNavigatepageNums();    页面显示12345   23456  样式用这个方法
		List<SalaryBean> list = page.getList();
		map.addAttribute("salarylist", list);
		map.addAttribute("pages",page);
		return "/pay/salaryManager.jsp";
	}
	@RequestMapping("/addSalary")
	public String addSalary(SalaryBean sb,Model m){
		salaryManagerService.addSalary(sb);
		return findAll(1,m);
	}

	@RequestMapping("/prepare")
	public String prepare(Model m){
		int code =salaryManagerService.prepareCode();
		m.addAttribute("code",code);
		return "/pay/salary_add.jsp";
		
	}
}
