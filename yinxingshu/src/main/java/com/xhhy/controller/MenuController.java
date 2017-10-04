package com.xhhy.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhhy.bean.DeptBean;
import com.xhhy.bean.MenuBean;
import com.xhhy.service.MenuService;
import com.xhhy.util.State;

@Controller
@RequestMapping("menu")
@SessionAttributes({"mls","pageNum","menuBean"})
public class MenuController {
	
	@Autowired
	private MenuService ms;
	
	
	@RequestMapping("menulist")
	public String getAllMenu(Model m,String pageNum,String method,MenuBean mb,HttpSession session) {
		// TODO Auto-generated method stub
		int pagenum=0;
		if(State.NOTNULL(pageNum)){
			pagenum=Integer.parseInt(pageNum);
		}else{
			pagenum=1;
		}
		 PageHelper.startPage(pagenum, State.PAGESIZE);
		 List<MenuBean> mls=new ArrayList<MenuBean>();
		 if("clear".equals(method)){
			 mb.setMenuName(null);
			 mb.setMenuState(999);
            session.removeAttribute("menuBean");
		 }
		 m.addAttribute("menuBean",mb);
		 mls=ms.getAllMenu(mb);
		PageInfo<Object> info=new PageInfo(mls,State.NUM);
		m.addAttribute("mls",mls);
		m.addAttribute("page",info);
		return "/resource/demo8/list.jsp";
	}
	@RequestMapping("/padd")
	public String paddDept(Model m){
		 List<MenuBean> mls=ms.getAllMenu();
		 m.addAttribute("mls",mls);
		return "/resource/demo8/add.jsp";
	}
	@RequestMapping("/add")
	public String addMenu(Model m,MenuBean mb){
		if(ms.addMenu(mb)){
			m.addAttribute("msg","添加成功。");
		}
		return "menulist";
	}
	@RequestMapping("/look")
	public String lookMenu(Model m,String menuId,String pageNum){
		MenuBean mb=ms.getMenuById(menuId);
		List<MenuBean> mls=ms.getAllMenu();
		 m.addAttribute("mls",mls);
		m.addAttribute("mb",mb);
		m.addAttribute("pageNum",pageNum);
		return "/resource/demo8/view.jsp";
	}
	
	@RequestMapping("/delete")
	public String deletMenu(Model m,@RequestParam("menuId")String menuId,@RequestParam("pageNum")String pageNum){
		if(ms.deleteMenu(menuId)){
			m.addAttribute("msg","删除成功。");
		}
		return "menulist";
	}
	
	@RequestMapping("/pupdate")
	public String pupdateDept(Model m, @RequestParam("menuId")String menuId,@RequestParam("pageNum")String pageNum){
		MenuBean mb=ms.getMenuById(menuId);
		 List<MenuBean> mls=ms.getAllMenu();
		 m.addAttribute("mls",mls);
		m.addAttribute("mb",mb);
		m.addAttribute("pageNum",pageNum);
		return "/resource/demo8/update.jsp";
	}
	
	@RequestMapping("update")
	public String updateDept(Model m,MenuBean mb,HttpSession session){
		ms.updateMenu(mb);
		return "menulist?pageNum="+(String)session.getAttribute("pageNum")+"";
	}
	
	/*public Set<String> autoComplete(Model m,@RequestParam("str")String menuname){
		Set<String> set=ms.autoComplete(menuname);
		m.addAttribute("set",set);
		return set;
	}*/
	
}
