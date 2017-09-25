package com.xhhy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.bean.SalaryBean;
import com.xhhy.service.SalaryManagerService;

/**
 * 
 * @author 强悦
 * 薪酬标准管理controller层
 */
@Controller
public class SalaryManagerController {
	
	@Resource
	private SalaryManagerService salaryManagerServie;
	
	@RequestMapping("/findAll")
	public String findAll(ModelMap map){
		System.out.println(1);
		List<SalaryBean> list = salaryManagerServie.findAll();
		map.put("list", list);
		return "pay/salaryManager.jsp";
	}

}
