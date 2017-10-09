package com.xhhy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.DeptBean;
import com.xhhy.bean.EducationBean;
import com.xhhy.bean.GuanliBean;
import com.xhhy.bean.MingxiBean;
import com.xhhy.bean.RecordBean;
import com.xhhy.bean.ResumeBean;
import com.xhhy.bean.UserBean;
import com.xhhy.bean.YearBean;
import com.xhhy.service.DeptService;
import com.xhhy.service.MingxiService;

@Controller
@SessionAttributes({ "mb", "rb", "eb", "yearBean","guabliBean" })
public class MingxiController {
	@Autowired
	private MingxiService ms;
	@Autowired
	private DeptService ds;

	@RequestMapping("/chuben")
	public String getquetyAll(Model m, ResumeBean rb, @RequestParam(value = "pageNum", required = false) int pageNum,
			HttpServletRequest request, @RequestParam(value = "flag", required = false) String query) {
		if (pageNum <= 0) {
			pageNum = 1;
		}
		if ("query".equals(query)) {
			request.getSession().removeAttribute("rb");
		}
		PageInfo info = ms.getqueryAll(pageNum, 2, 3, rb.getName());
		List<ResumeBean> l = info.getList();
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
		return "/datamsg/demo1/list.jsp";
	}

	@RequestMapping("/ducation")
	public String geteducation(Model m, EducationBean eb, @RequestParam(value = "query", required = false) String query,
			HttpServletRequest request) {
		if ("query".equals(query)) {
			request.getSession().removeAttribute("eb");
		}
		List<EducationBean> la=ms.geteducationa();
		List<EducationBean> l = ms.geteducation(eb.getEducationId());
		m.addAttribute("la", la);
		m.addAttribute("eb", eb);
		m.addAttribute("l", l);
		return "datamsg/demo2/list.jsp";
	}

	@RequestMapping("/year")
	public String getyear(Model m,  YearBean yb,
			@RequestParam(value = "query", required = false) String query, HttpServletRequest request) {
		if ("query".equals(query)) {
			yb.setDeptId(999);
			m.addAttribute("yearBean", yb);
		}
		List<YearBean> l = ms.getyear(yb.getEducationId(), yb.getDeptId());
		List<DeptBean> list = ds.getAllDept();
		m.addAttribute("yearBean", yb);
		m.addAttribute("l", l);
		m.addAttribute("list", list);
		m.addAttribute("yb", yb);
		return "/datamsg/demo2/zilist.jsp";
	}
	
	
	@RequestMapping("/guanli")
	public String getzhixian(Model m,GuanliBean gb,
			@RequestParam(value = "query", required = false) String query, HttpServletRequest request){
		if ("query".equals(query)) {
			gb.setGuanliId(999);
			m.addAttribute("guabliBean", gb);
		}
		List<GuanliBean> list = ms.getzhixian(gb.getGuanliId());
		List<GuanliBean> l = ms.getzhixiana();
		m.addAttribute("l",l);
		m.addAttribute("list", list);
		m.addAttribute("guabliBean", gb);
		return "/datamsg/demo5/list.jsp";
	}
}
