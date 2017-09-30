package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.RecordBean;
import com.xhhy.bean.SalaryBean;
import com.xhhy.service.SalaryManagerService;
import com.xhhy.util.State;

/**
 * 
 * @author 强悦 薪酬标准管理controller层
 */
@Controller
@RequestMapping("/salary")
@SessionAttributes({ "salaryBean" })
public class SalaryManagerController {


	@Autowired
	private SalaryManagerService salaryManagerService;

	/**
	 * 展现所有并分页
	 * 
	 * @param pageNum
	 * @param map
	 * @return
	 */
	@RequestMapping("/findAll")
	public String findAll(SalaryBean sb, @RequestParam(value = "flag", required = false) String flag, int pageNum,
			Model map) {
		System.out.println(flag);
		if ("clear".equals(flag)) {
			sb.setSalaryName(null);
			sb.setSalaryState(0);
		}
		PageInfo page = salaryManagerService.getSalarys(sb, pageNum, State.PAGESIZE, State.NUM);
		// page.getNavigatepageNums(); 页面显示12345 23456 样式用这个方法
		List<SalaryBean> list = page.getList();
		map.addAttribute("salaryBean", sb);
		map.addAttribute("salarylist", list);
		map.addAttribute("page", page);
		return "/pay/salaryManager.jsp";
	}

	
	
	/**
	 * 增加薪酬标准
	 * 
	 * @param sb
	 * @param m
	 * @return
	 */
	@RequestMapping("/addSalary")
	public String addSalary(SalaryBean sb, Model m) {
		sb.setSalaryDel(State.UNDEL);
		sb.setSalaryState(State.SALARY_QICAO);
		salaryManagerService.addSalary(sb);
		return findAll(new SalaryBean(), "clear", 1, m);
	}

	/**
	 * 获取薪酬编码
	 * 
	 * @param m
	 * @return
	 */
	@RequestMapping("/prepare")
	public String prepare(Model m) {
		int code = salaryManagerService.prepareCode();
		m.addAttribute("code", code + 1);
		return "/pay/salary_add.jsp";

	}

	/**
	 * 查看薪酬信息详情
	 * 
	 * @param salaryId
	 * @param m
	 * @return
	 */
	@RequestMapping("/message")
	public String message(int salaryId, Model m) {
		SalaryBean sb = salaryManagerService.message(salaryId);
		m.addAttribute("message", sb);
		return "/pay/salary_sp_message.jsp";
	}


	
	/**
	 * 预修改
	 * 
	 * @param salaryId
	 * @param m
	 * @return
	 */
	@RequestMapping("/updateMessage")
	public String updateMessage(int salaryId, int pageNum, Model m) {
		SalaryBean sb = salaryManagerService.message(salaryId);
		m.addAttribute("message", sb);
		m.addAttribute("pageNum", pageNum);
		return "/pay/salary_update.jsp";
	}

	/**
	 * 修改薪酬信息
	 */
	@RequestMapping("/update")
	public String update(SalaryBean sb, int pageNum, @RequestParam("flag") int flag, Model map) {
		// flag是1 是修改
		// flag是2 是先修改 后提交审核 需要修改薪酬的状态
		System.out.println(sb);
		salaryManagerService.update(sb, flag);
		return findAll(new SalaryBean(), "clear", pageNum, map);
	}

	/**
	 * 删除薪酬标准信息
	 */
	@RequestMapping("/delete")
	public String delete(int salaryId, int pageNum, Model m) {
		salaryManagerService.delete(salaryId);
		return findAll(new SalaryBean(), "clear", pageNum, m);
	}
	
	/**
	 * 修改薪酬的状态
	 */
	@RequestMapping("/updateSate")
	public String updateState(int state,int salaryId, int pageNum, Model m){
		salaryManagerService.updateState(state, salaryId);
		return findAll(new SalaryBean(), "clear", pageNum, m) ;
		
	}

	/**
	 * 状态为审核中的展现和分页
	 * @param sb
	 * @param flag
	 * @param pageNum
	 * @param map
	 * @return
	 */
	@RequestMapping("/findSp")
	public String findSp(SalaryBean sb, @RequestParam(value = "flag", required = false) String flag, int pageNum,
			Model map) {
		System.out.println(flag);
		if ("clear".equals(flag)) {
			sb.setSalaryName(null);
		}
		PageInfo page = salaryManagerService.getSalarySp(sb, pageNum, State.PAGESIZE, State.NUM);
		// page.getNavigatepageNums(); 页面显示12345 23456 样式用这个方法
		List<SalaryBean> list = page.getList();
		map.addAttribute("salaryBean", sb);
		map.addAttribute("salarylist", list);
		map.addAttribute("page", page);
		return "/pay/salary_sp.jsp";
	}


	/**
	 * 查看薪酬审批信息详情
	 * 
	 * @param salaryId
	 * @param m
	 * @return
	 */
	@RequestMapping("/spMessage")
	public String spMessage(int salaryId, Model m,int pageNum) {
		SalaryBean sb = salaryManagerService.message(salaryId);
		m.addAttribute("message", sb);
		m.addAttribute("pageNum", pageNum);
		return "/pay/salary_sp_sh.jsp";
	}
	
	/**
	 * 审核薪酬标准信息
	 */
	@RequestMapping("/shenHe")
	public String shenHe(int salaryState,int salaryId, int pageNum, Model m){
		salaryManagerService.updateState(salaryState, salaryId);
		return findSp(new SalaryBean(), "clear", pageNum, m) ;
		
	}

}
