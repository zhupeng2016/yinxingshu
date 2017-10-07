package com.xhhy.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.xhhy.bean.DeptBean;
import com.xhhy.bean.RoleBean;
import com.xhhy.bean.UserBean;
import com.xhhy.service.DeptService;
import com.xhhy.service.RoleService;
import com.xhhy.service.UserRoleService;
import com.xhhy.util.State;

@Controller
@RequestMapping("user")
@SessionAttributes({ "userBean" })
public class UserRoleController {

	@Autowired
	private UserRoleService urs;
	@Autowired
	private DeptService ds;
	@Autowired
	private RoleService rs;

	@RequestMapping("/userlist")
	public String getAllUsers(Model m, Integer pageNum, UserBean userBean, HttpSession session, String method) {
		 
		if ("clear".equals(method)) {
			userBean.setUserName(null);
			userBean.setRoleName(null);
			userBean.setDeptName(null);
		}
		m.addAttribute("userBean", userBean);
		PageHelper.startPage(pageNum, State.PAGESIZE);
		List<UserBean> userlist = null;
		userlist = urs.getAllUsers(userBean);
		PageInfo<Object> pl = new PageInfo(userlist, State.NUM);
		m.addAttribute("uls", userlist);
		m.addAttribute("page", pl);
		return "/resource/demo2/list.jsp";
	}

	@RequestMapping("/delete")
	public String delete(Model m, int userId, int pageNum) {
		if (urs.delete(userId)) {
			m.addAttribute("msg", "删除成功。");
		} else {
			m.addAttribute("msg", "删除失败。");
		}
		m.addAttribute("pageNum", pageNum);
		return "userlist";
	}

	@RequestMapping("/look")
	public String look(Model m, int userId, int pageNum) {
		UserBean ub = urs.getUserById(userId);
		m.addAttribute("ub", ub);
		m.addAttribute("pageNum", pageNum);
		return "/resource/demo2/view.jsp";
	}

	@RequestMapping("/pupdate")
	public String pupdate(Model m, int userId, int pageNum) {
		UserBean ub = urs.getUserById(userId);
		m.addAttribute("user", ub);
		// 所有部门
		List<DeptBean> dls = ds.getAllDept();
		m.addAttribute("dls", dls);
		// 所有职位
		List<RoleBean> rls = rs.getRoles();
		m.addAttribute("rls", rls);
		m.addAttribute("pageNum", pageNum);
		return "/resource/demo2/update.jsp";
	}

	@RequestMapping("/update")
	public String update(Model m, int userId, int pageNum,
			HttpServletRequest request, UserBean ub,MultipartFile file) throws IllegalStateException, IOException {
		String userImg=null;
		if (!file.isEmpty()) {
			// 保存文件路径
			String path = request.getSession().getServletContext().getRealPath("/imgs/");
			// 上传文件名
			String filename = file.getOriginalFilename();
			// 将上传文件保存到一个目标文件当中
			file.transferTo(new File(path +"/"+ filename));
			userImg=("imgs/"+filename);
		}
		ub.setUserId(userId);
	  ub.setUserImg(userImg);
		if (urs.update(ub)) {
			m.addAttribute("msg", "修改成功。");
		} else {
			m.addAttribute("msg", "修改失败。");
		}
		m.addAttribute("pageNum", pageNum);
		return "userlist?method=clear";
	}

	@RequestMapping("/padd")
	public String padd(Model m) {
		// 所有部门
		List<DeptBean> dls = ds.getAllDept();
		m.addAttribute("dls", dls);
		// 所有职位
		List<RoleBean> rls = rs.getRoles();
		m.addAttribute("rls", rls);
		// 最大编号
		String maxcode = urs.getMaxCode();
		String nextcode = "";
		if (Integer.parseInt(maxcode.substring(7, 10)) < 9) {
			nextcode = maxcode.substring(0, 7) + "00" + (Integer.parseInt(maxcode.substring(7, 10)) + 1);
		}
		if (Integer.parseInt(maxcode.substring(7, 10)) < 99) {
			nextcode = maxcode.substring(0, 7) + "0" + (Integer.parseInt(maxcode.substring(7, 10)) + 1);
		} else {
			nextcode = maxcode.substring(0, 7) + (Integer.parseInt(maxcode.substring(7, 10)) + 1);
		}
		m.addAttribute("nextcode", nextcode);
		return "/resource/demo2/add.jsp";
	}

	@RequestMapping("/add")
	public String add(Model m,HttpServletRequest request, UserBean ub,MultipartFile file) throws IllegalStateException, IOException {
		String userImg=null;
		if (!file.isEmpty()) {
			// 保存文件路径
			String path = request.getSession().getServletContext().getRealPath("/imgs/");
			// 上传文件名
			String filename = file.getOriginalFilename();
			// 将上传文件保存到一个目标文件当中
			file.transferTo(new File(path +"/"+ filename));
			userImg=("imgs/"+filename);
		}
	  ub.setUserImg(userImg);
	  if (urs.add(ub)) {
			m.addAttribute("msg", "添加成功。");
		} else {
			m.addAttribute("msg", "添加失败。");
		}
		return "userlist?method=clear&pageNum=1";
	}

	@RequestMapping("/onlyone")
	public void onlyOne(Model m, String loginName, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		UserBean ubb =null;
		if(loginName!=null){
			 ubb = urs.getUserByName(loginName);
		}
		PrintWriter out = response.getWriter();
		if (ubb != null) {
			out.print(false); // 代表账号不可以用。
		}else{
			out.print(true);
		}
		out.flush();
		out.close();
	}
	//自动补全
	@RequestMapping("/auto")
	public void auto(Model m, String loginName, HttpServletResponse response) throws IOException {
		Set<String> l = urs.autoCompleteString();
		response.setContentType("text/html;");
		PrintWriter out = response.getWriter();
		String s = new Gson().toJson(l);
		System.out.println(s);
		out.write(s);
		out.flush();
		out.close();
	}
	//部门改变，职位改变。。
	@RequestMapping("/changeRole")
	public void changeRole(Model m, int deptId,HttpServletResponse response) throws IOException {
		List<RoleBean> l=urs.getRoleByDetp(deptId);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String s = new Gson().toJson(l);
		out.write(s);
		out.flush();
		out.close();
	}
	
}
