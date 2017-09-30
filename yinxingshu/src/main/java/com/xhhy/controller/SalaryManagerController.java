package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		map.addAttribute("page",page);
		return "/pay/salaryManager.jsp";
	}
	/**
	 * 增加薪酬标准
	 * @param sb
	 * @param m
	 * @return
	 */
	@RequestMapping("/addSalary")
	public String addSalary(SalaryBean sb,Model m){
		sb.setSalaryDel(State.UNDEL);
		sb.setSalaryState(State.SALARY_QICAO);
		salaryManagerService.addSalary(sb);
		return findAll(1,m);
	}

	/**
	 * 获取薪酬编码
	 * @param m
	 * @return
	 */
	@RequestMapping("/prepare")
	public String prepare(Model m){
		int code =salaryManagerService.prepareCode();
		m.addAttribute("code",code+1);
		return "/pay/salary_add.jsp";
		
	}
	
	/**
	 * 查看薪酬信息详情
	 * @param salaryId
	 * @param m
	 * @return
	 */
	@RequestMapping("/message")
	public String message(int salaryId,Model m){
		SalaryBean sb = salaryManagerService.message(salaryId);
		m.addAttribute("message", sb);
		return "/pay/salary_sp_message.jsp";
	}
	
	/**
	 * 预修改
	 * @param salaryId
	 * @param m
	 * @return
	 */
	@RequestMapping("/updateMessage")
	public String updateMessage(int salaryId,int pageNum,Model m){
		SalaryBean sb = salaryManagerService.message(salaryId);
		m.addAttribute("message", sb);
		m.addAttribute("pageNum", pageNum);
		return "/pay/salary_update.jsp";
	}
	
	
	/**
	 * 修改薪酬信息
	 */
	@RequestMapping("/update")
	public String update(SalaryBean sb,int pageNum,Model map){
		salaryManagerService.update(sb);	
		return findAll(pageNum, map);
		
	}
	
	/**
	 * 删除薪酬标准信息
	 */
	@RequestMapping("/delete")
	public String delete(int salaryId,int pageNum,@RequestParam(value="flag",required=false)int flag,Model m){
		salaryManagerService.delete(salaryId);
		System.out.println(flag);
		if(flag == 1){
			//修改审核状态为审核中
		}
		return findAll(pageNum,m);
	}
	
}
