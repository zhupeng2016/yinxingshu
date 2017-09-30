package com.xhhy.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.junit.runners.Parameterized.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhhy.bean.DeptBean;
import com.xhhy.bean.MenuBean;
import com.xhhy.bean.RoleBean;
import com.xhhy.service.DeptService;
import com.xhhy.service.MenuService;
import com.xhhy.service.RoleMenuService;
import com.xhhy.service.RoleService;
import com.xhhy.util.State;

@Controller
@RequestMapping("/role")
@SessionAttributes({"pageNum"})
public class GeRoleController {

	@Autowired
	private RoleService rs;
	@Autowired
	private DeptService ds;
	@Autowired
	private MenuService ms;
	@Autowired
	private RoleMenuService rms;

	// 职位信息展示。
	@RequestMapping("/rolelist")
	public String roleList(Model m,String pageNum,String method,RoleBean rb,HttpSession session) {
		int pagenum=0;
//		System.out.println(pageNum);
		if(State.NOTNULL(pageNum)){
			pagenum=Integer.parseInt(pageNum);
		}else{
			pagenum=1;
		}
		 PageHelper.startPage(pagenum, State.PAGESIZE);
		 
        List<RoleBean> rolelist = rs.getAllRole(rb);
		m.addAttribute("rls", rolelist);
		PageInfo<Object> pl=new PageInfo(rolelist,State.NUM);
		m.addAttribute("page",pl);
		
		return "/resource/demo3/list.jsp";
	}

	// 根据职位id状态删除职位信息
	@RequestMapping("/delete")
	public String deleteRole(Model m, int roleId,int pagenum) {
		if (rs.delRole(roleId)) {
			m.addAttribute("msg", "删除成功。");
		} else {
			m.addAttribute("msg", "删除失败。");
		}
//		session.removeAttribute("pageNum");
//		m.addAttribute("pageNum",pageNum);
		return "rolelist?pageNum="+pagenum+"";
	}

	// 修改角色对应的信息，查到当前角色对应的菜单，及所有菜单。
	@RequestMapping("/pupdate")
	public String pupdateRole(Model m, int roleId,@RequestParam("pageNum")String pageNum) {
		RoleBean rb = rs.getRole(roleId);
		// 得到所有菜单信息
		List<MenuBean> l2 = ms.getAllMenu();
//		System.out.println(l2.size());
		// 得到当前人的对应的菜单信息。
		List<MenuBean> l1 = rms.getMenuList(roleId);
		// 对该角色选中的菜单给予true
		for (int i = 0; i < l1.size(); i++) {
			MenuBean m1 = l1.get(i);
			for (int j = 0; j < l2.size(); j++) {
				MenuBean m2 = l2.get(j);
				if (m1.getMenuId() == m2.getMenuId()) {
					m2.setIs(true);
				}
			}
		}
		// 所有部门。
		List<DeptBean> dls = ds.getAllDept();
		m.addAttribute("dls", dls);
		m.addAttribute("rb", rb);
		m.addAttribute("ml", l2);

		m.addAttribute("pageNum",pageNum);
		return "/resource/demo3/update.jsp";
	}

	@RequestMapping("/update")
	public String updateRole(Model m,int roleId, RoleBean rb,int[] menuIds,HttpSession session) {
		rb.setRoleId(roleId);
		rms.delete(roleId);
		rs.updateRoleBy(rb);
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < menuIds.length; i++) {
			ls.add(menuIds[i]);
		}
		boolean is = rms.addMenu(roleId,ls);
		if(is){
			m.addAttribute("msg","修改成功。");
		}else{
			m.addAttribute("msg","修改失败。");
		}
		return "rolelist?pageNum="+(String)session.getAttribute("pageNum")+"";
	}

	@RequestMapping("/look")
	public String lookrole(Model m, int roleId,String pageNum) {
		RoleBean rb = rs.getRole(roleId);
		m.addAttribute("rb", rb);
		List<MenuBean> l1 = rms.getMenuList(roleId);
		m.addAttribute("ml", l1);
		m.addAttribute("pageNum",pageNum);
		
		return "/resource/demo3/view.jsp";
	}

	@RequestMapping("/padd")
	public String paddRole(Model m) {
		List<DeptBean> dls = ds.getAllDept();
		m.addAttribute("dls", dls);
		List<MenuBean> l2 = ms.getAllMenu();
		m.addAttribute("ml", l2);
		return "/resource/demo3/add.jsp";
	}
	
	@RequestMapping("/add")
	public String addRole(Model m,RoleBean rb) {
        rs.addRole(rb);
		return "rolelist";
	}

}
