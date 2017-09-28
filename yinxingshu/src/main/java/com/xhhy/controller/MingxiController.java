package com.xhhy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.DeptBean;
import com.xhhy.bean.MingxiBean;
import com.xhhy.bean.RecordBean;
import com.xhhy.bean.ResumeBean;
import com.xhhy.bean.UserBean;
import com.xhhy.service.DeptService;
import com.xhhy.service.MingxiService;

@Controller
@SessionAttributes({ "mb","rb"})
public class MingxiController {
	@Autowired
	private MingxiService ms;
	@Autowired
	private DeptService ds;

	@RequestMapping("/chuben")
	public String getquetyAll(Model m, ResumeBean rb,@RequestParam(value = "pageNum", required = false) int pageNum,
			HttpServletRequest request, @RequestParam(value = "flag", required = false) String query) {
		if (pageNum <= 0) {
			pageNum = 1;
		}
		if ("query".equals(query)) {
			request.getSession().removeAttribute("rb");
		}
		 PageInfo info= ms.getqueryAll(pageNum, 2, 3,rb.getName());
		 List<ResumeBean> l =info.getList();
		m.addAttribute("rb", rb);
		m.addAttribute("l", l);
		m.addAttribute("page", info);
		return "datamsg/demo4/list.jsp";
	}

	@RequestMapping("/mingxi")
	public String quetyAll(@RequestParam(value = "pageNum", required = false) int pageNum, Model m, MingxiBean mb,
			@RequestParam(value = "query", required = false) String query, HttpServletRequest request) {
		if (pageNum <= 0) {
			pageNum = 1;
		}
		if ("query".equals(query)) {
			request.getSession().removeAttribute("mb");
		}
		PageInfo info = ms.queryAll(pageNum, 2, 3, mb);
		List<MingxiBean> list = info.getList();
		List<DeptBean> l = ds.getAllDept();
		m.addAttribute("mb", mb);
		m.addAttribute("l", l);
		m.addAttribute("list", list);
		m.addAttribute("page", info);
		return "datamsg/demo1/list.jsp";
	}
}
