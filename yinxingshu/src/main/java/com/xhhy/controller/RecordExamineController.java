package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.SessionScope;

import com.xhhy.bean.RecordBean;
import com.xhhy.bean.SalaryBean;
import com.xhhy.service.RecordExamineService;

@Controller
@SessionAttributes("reList")
public class RecordExamineController {

	@Autowired
	private RecordExamineService res;
	
	//展现审批管理
	@RequestMapping("/recordExamine")
	public String showAllRecordExamine(Model m){
		List<RecordBean> reList = res.showAllRecordExamine();
		m.addAttribute("reList", reList);
		return "/pmag/demo1/examine.jsp";
	}
	
	/*@RequestMapping("/updateMessage")
	public String updateMessage(int salaryId,int pageNum,Model m){
		SalaryBean sb = salaryManagerService.message(salaryId);
		m.addAttribute("message", sb);
		m.addAttribute("pageNum", pageNum);
		return "/pay/salary_update.jsp";
	}*/
	
	 
	@RequestMapping("/transaction")
	public String queryOneRecord(int archiveId,Model m){
		RecordBean rb = res.queryOneRecord(archiveId);
		System.out.println(rb.getArchiveEmail());
		m.addAttribute("rbb", rb);
		return "/pmag/demo1/transaction.jsp";  
	}
	 
}
