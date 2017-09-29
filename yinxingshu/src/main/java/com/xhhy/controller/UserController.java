package com.xhhy.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.xhhy.bean.UserBean;
import com.xhhy.service.UserService;

@Controller
@SessionAttributes({"ub","ipAddress"})
public class UserController {
	@Autowired
	private UserService us;

	@RequestMapping("/login")
	public String login(String loginName, String password, Model m, HttpServletRequest request) {
		UserBean ub = us.login(loginName, password);
		if (ub != null) {
			if (ub.getUserDel() == "1") {
				m.addAttribute("msg", "您的账号已禁用!");
				return "/login.jsp";
			} else {

				String ipAddress = request.getHeader("x-forwarded-for");
				if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
					ipAddress = request.getHeader("Proxy-Client-IP");
				}
				if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
					ipAddress = request.getHeader("WL-Proxy-Client-IP");
				}
				if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
					ipAddress = request.getRemoteAddr();
					if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
						InetAddress inet = null;
						try {
							inet = InetAddress.getLocalHost();
						} catch (UnknownHostException e) {
							e.printStackTrace();
						}
						ipAddress = inet.getHostAddress();
					}
				}
				if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length()
																	// = 15
					if (ipAddress.indexOf(",") > 0) {
						ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
					}
				}
				m.addAttribute("ipAddress", ipAddress);

				ServletContext sc = request.getSession().getServletContext();
				List<UserBean> l = null;
				Object obj = sc.getAttribute("uon");
				if (obj != null) {
					l = (List) obj;
				} else {
					l = new ArrayList<UserBean>();
				}
				boolean is = true;
				for (int i = 0; i < l.size(); i++) {
					UserBean u = l.get(i);
					if (u != null && u.getUserId() == ub.getUserId()) {
						is = false;
						break;
					}
				}

				if (is) {
					l.add(ub);
					us.update(ub.getUserId());
					m.addAttribute("ub", ub);
					sc.setAttribute("uon", l);
					return "home/index";
				} else {
					m.addAttribute("msg", "该帐号已登录");
					return "/login.jsp";
				}
			}
		} else {
			m.addAttribute("msg", "账号或密码错误");
			return "/login.jsp";
		}
	}

	@RequestMapping("/left")
	public String msg(Model m, HttpServletRequest request) {
		UserBean u = (UserBean) request.getSession().getAttribute("ub");
		if (u != null) {
			m.addAttribute("u", u);
		}
		return "/msg.jsp";
	}

	@RequestMapping("/msg")
		public String index(Model m,UserBean u){
			boolean is=us.UpdateById(u);
			if(is){
				return "/right.jsp";
			}else{
				return "/msg.jsp";
			}
		}	
	@RequestMapping("/password")
	public String password(Model m,UserBean u,HttpServletRequest request){
		UserBean u2=(UserBean)request.getSession().getAttribute("ub");
		boolean is = us.getUpdate(u);
		return "/head";
	}
}
