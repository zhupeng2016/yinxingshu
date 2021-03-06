package com.xhhy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
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
@SessionAttributes({ "pageNum", "roleBean" })
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
	public String roleList(Model m, String pageNum, String method, RoleBean rb, HttpSession session) {
		int pagenum = 0;
		if (State.NOTNULL(pageNum)) {
			pagenum = Integer.parseInt(pageNum);
		} else {
			pagenum = 1;
		}
		PageHelper.startPage(pagenum, State.PAGESIZE);
		if ("clear".equals(method)) {
			rb.setRoleName(null);
			rb.setDeptName(null);
			rb.setRoleState(999);
			session.removeAttribute("roleBean");
		}
		m.addAttribute("roleBean", rb);
		List<RoleBean> rolelist = rs.getAllRole(rb);
		m.addAttribute("rls", rolelist);
		PageInfo<Object> pl = new PageInfo(rolelist, State.NUM);
		m.addAttribute("page", pl);
		return "/resource/demo3/list.jsp";
	}

	// 根据职位id状态删除职位信息
	@RequestMapping("/delete")
	public String deleteRole(Model m, int roleId, int pagenum) {
		if (rs.delRole(roleId)) {
			m.addAttribute("msg", "删除成功。");
		} else {
			m.addAttribute("msg", "删除失败。");
		}
		// session.removeAttribute("pageNum");
		// m.addAttribute("pageNum",pageNum);
		return "rolelist?pageNum=" + pagenum + "&method=clear";
	}

	// 修改角色对应的信息，查到当前角色对应的菜单，及所有菜单。
	@RequestMapping("/pupdate")
	public String pupdateRole(Model m, int roleId, @RequestParam("pageNum") String pageNum) {
		RoleBean rb = rs.getRole(roleId);
		// 得到所有菜单信息
		List<MenuBean> l2 = ms.getMenus();
		System.out.println(l2.size());
		// 得到当前人的对应的菜单信息。
		List<MenuBean> l1 = rms.getMenuList(roleId);
		System.out.println(l1.size());
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

		m.addAttribute("pageNum", pageNum);
		return "/resource/demo3/update.jsp";
	}

	@RequestMapping("/update")
	public String updateRole(Model m, int roleId, RoleBean rb, int[] menuIds, HttpSession session) {
		rb.setRoleId(roleId);
		rms.delete(roleId);
		rs.updateRoleBy(rb);
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < menuIds.length; i++) {
			ls.add(menuIds[i]);
		}
		boolean is = rms.addMenu(roleId, ls);
		if (is) {
			m.addAttribute("msg", "修改成功。");
		} else {
			m.addAttribute("msg", "修改失败。");
		}
		return "rolelist?pageNum=" + (String) session.getAttribute("pageNum") + "&method=clear";
	}

	@RequestMapping("/look")
	public String lookrole(Model m, int roleId, String pageNum) {
		RoleBean rb = rs.getRole(roleId);
		m.addAttribute("rb", rb);
		List<MenuBean> l1 = rms.getMenuList(roleId);
		m.addAttribute("ml", l1);
		m.addAttribute("pageNum", pageNum);

		return "/resource/demo3/view.jsp";
	}

	@RequestMapping("/padd")
	public String paddRole(Model m) {
		List<DeptBean> dls = ds.getAllDept();
		m.addAttribute("dls", dls);
		List<MenuBean> l2 = ms.getMenus();
		m.addAttribute("ml", l2);
		// 最大编号
				String maxcode = rs.getMaxCode();
				String nextcode = "";
				if (Integer.parseInt(maxcode.substring(4, 7)) < 9) {
					nextcode = maxcode.substring(0, 4) + "00" + (Integer.parseInt(maxcode.substring(4, 7)) + 1);
				}
				if (Integer.parseInt(maxcode.substring(4, 7)) < 99) {
					nextcode = maxcode.substring(0, 4) + "0" + (Integer.parseInt(maxcode.substring(4, 7)) + 1);
				} else {
					nextcode = maxcode.substring(0, 4) + (Integer.parseInt(maxcode.substring(4, 7)) + 1);
				}
				m.addAttribute("nextcode", nextcode);
		return "/resource/demo3/add.jsp";
	}

	@RequestMapping("/add")
	public String addRole(Model m, RoleBean rb,int[] menuIds) {
		rs.addro(rb);
		int roleId=rs.getIdByCode(rb.getRoleCode());
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < menuIds.length; i++) {
			ls.add(menuIds[i]);
		}
		boolean is = rms.addMenu(roleId, ls);
		if (is) {
			m.addAttribute("msg", "添加成功。");
		} else {
			m.addAttribute("msg", "添加失败。");
		}
		return "rolelist?method=clear";
	}
	//自动补全
	@RequestMapping("/autoComplete")
	public void auto(Model m, HttpServletResponse response) throws IOException {
		Set<String> l = rms.autoCompleteString();
		response.setContentType("text/html;");
		PrintWriter out = response.getWriter();
		String s = new Gson().toJson(l);
		System.out.println(s);
		out.write(s);
		out.flush();
		out.close();

	}
	

}
