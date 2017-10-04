package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhhy.bean.DeptBean;
import com.xhhy.bean.RoleBean;
import com.xhhy.bean.UserBean;
import com.xhhy.service.DeptService;
import com.xhhy.service.RoleService;
import com.xhhy.service.UserRoleService;
import com.xhhy.util.State;

@Controller
@RequestMapping("user")
@SessionAttributes({"userName","roleName","deptName"})
public class UserRoleController {
	
	@Autowired
	private UserRoleService urs;
	@Autowired
	private DeptService ds;
	@Autowired
	private RoleService rs;
	
	
	@RequestMapping("/userlist")
	public String getAllUsers(Model m,Integer pageNum,String flag,String userName,
			String roleName,String deptName,String method){
             if( pageNum==0){
	               pageNum=1;
               }
             if("clear".equals(method)){
            	 m.addAttribute("roleName",null);
            	 m.addAttribute("userName",null);
            	 m.addAttribute("deptName",null);
             }
             List<UserBean> userlist=null;
		 PageHelper.startPage(pageNum, State.PAGESIZE);
		userlist=urs.getAllUsers(userName,roleName,deptName);
		PageInfo<Object> pl=new PageInfo(userlist,State.NUM);
		m.addAttribute("uls",userlist);
		m.addAttribute("page",pl);
		return "/resource/demo2/list.jsp";
	}
	
	@RequestMapping("/delete")
	public String delete(Model m,int userId,int pageNum){
		if(urs.delete(userId)){
			m.addAttribute("msg","删除成功。");
		}else{
			m.addAttribute("msg","删除失败。");
		}
		m.addAttribute("pageNum",pageNum);
		return "userlist";
	}

	@RequestMapping("/look")
	public String look(Model m,int userId,int pageNum){
		UserBean ub=urs.getUserById(userId);
		m.addAttribute("ub",ub);
		m.addAttribute("pageNum",pageNum);
		return "/resource/demo2/view.jsp";
	}
	
	@RequestMapping("/pupdate")
	public String pupdate(Model m,int userId,int pageNum){
		UserBean ub=urs.getUserById(userId);
		m.addAttribute("user",ub);
		//所有部门
		List<DeptBean> dls=ds.getAllDept();
		m.addAttribute("dls",dls);
		//所有职位
		List<RoleBean> rls=rs.getRoles();
		m.addAttribute("rls",rls);
		m.addAttribute("pageNum",pageNum);
		return "/resource/demo2/update.jsp";
	}
	
	@RequestMapping("/update")
	public String update(Model m,int userId,UserBean ub,int pageNum){
		ub.setUserId(userId);
		if(urs.update(ub)){
			m.addAttribute("msg","修改成功。");
		}else{
			m.addAttribute("msg","修改失败。");
		}
		m.addAttribute("pageNum",pageNum);
		return "userlist";
	}
	
	@RequestMapping("/padd")
	public String padd(Model m){
		//所有部门
		List<DeptBean> dls=ds.getAllDept();
		m.addAttribute("dls",dls);
		//所有职位
		List<RoleBean> rls=rs.getRoles();
		m.addAttribute("rls",rls);
		//最大编号
		String maxcode=urs.getMaxCode();
		String nextcode="";
		if(Integer.parseInt(maxcode.substring(7,10))<100){
			nextcode=maxcode.substring(0,7)+"0"+(Integer.parseInt(maxcode.substring(7,10))+1);
		}else{
			nextcode=maxcode.substring(0,7)+(Integer.parseInt(maxcode.substring(7,10))+1);
		}
		m.addAttribute("nextcode",nextcode);
		return "/resource/demo2/add.jsp";
	}
	
	@RequestMapping("/add")
	public String add(Model m,UserBean ub){
		if(urs.add(ub)){
			m.addAttribute("msg","添加成功。");
		}else{
			m.addAttribute("msg","添加失败。");
		}
		
		return "userlist";
	}
}
