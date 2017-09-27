package com.xhhy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.DeptBean;
import com.xhhy.bean.RecordBean;
import com.xhhy.service.DeptService;
import com.xhhy.service.RecordManageService;

@Controller
@SessionAttributes({ "recordList" })
// @RequestMapping("/record")
public class RecordManageController {

	@Autowired
	private RecordManageService rms;
	@Autowired
	private DeptService ds;

	// 展现列表
	@RequestMapping("/RecordManage")
	public String showAllRecord(@RequestParam(value = "pageNum", required = false) int pageNum, Model m,
			RecordBean rb,
			@RequestParam(value="query",required=false)String query,HttpServletRequest request) {
		if (pageNum <= 0) {
			pageNum = 1;
		}
		//清除的方法==
		if("query".equals(query)){
			  request.getSession().removeAttribute("rb");
		}
		PageInfo info = rms.showAllRecords(pageNum, 4, 1,rb);
		List<RecordBean> list = info.getList();
		// List<RecordBean> list=rms.showAllRecord();
		m.addAttribute("recordList", list);
		m.addAttribute("page", info);
		// 把list存到session中
		return "/pmag/demo1/list.jsp";
	}

	// 添加档案
	@RequestMapping("/insertRecord")
	public String insertRecord(@RequestParam(value = "pageNum", required = false) int pageNum, Model m,
			RecordBean rb,
			@RequestParam(value="query",required=false)String query,HttpServletRequest request) {
		rms.insertRecord(rb);
		// 调用部门表的展现列表的方法
		List<DeptBean> deptList = ds.getAllDept();
		// 把deptList存上，在页面中取值
		m.addAttribute("deptList", deptList);
		return showAllRecord(1, m,rb,"query",request);
	}

	// 从list页面先跳到这里，然后跳到添加页面
	@RequestMapping("/prepareData")
	public String prepareRecord(RecordBean rb, Model m) {
		return "/pmag/demo1/add.jsp";
	}
	
	/*
	 * 明细
	 */
	public String queryOneRecord(int archiveId,Model m){
		RecordBean rb = rms.queryOneRecord(archiveId);
		m.addAttribute("recordBean", rb);
		return "/pmag/demo1/query.jsp";
	}
	/*
	 * 变更前（要有数据）
	 */
	@RequestMapping("/pupdate")
	public String pupdateOneRecord(Model m,int archiveId){
		RecordBean recordBean = rms.pupdateOneRecord(archiveId);
		m.addAttribute("rb", recordBean);
		return "/pmag/demo1/biangeng.jsp";
	}
	/*
	 * 变更
	 */
	@RequestMapping("/update")
	public String updateOneRecord(Model m,RecordBean rb){
		boolean isok = rms.updateOneRecord(rb);
		if (isok) {
			return "";
		}else{
			return "";
		}
	}

}
