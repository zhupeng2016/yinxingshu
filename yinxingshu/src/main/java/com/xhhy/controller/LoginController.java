package com.xhhy.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.bean.UserBean;
import com.xhhy.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService us;
	@RequestMapping("/head")
	public String head(HttpServletRequest request,Model m){
		HttpSession session = request.getSession();
		UserBean ub = (UserBean)session.getAttribute("ub");

		if(ub != null){
			ServletContext sc = request.getSession().getServletContext();
			List<UserBean> l = (List)sc.getAttribute("uon");
			for(int i=0;i<l.size();i++){
				UserBean u = l.get(i);
				if(u != null && ub!=null && u.getUserId() == ub.getUserId()){
					l.remove(i);
					break;
				}

		
			}
			sc.setAttribute("uon", l);
		}

		
		
		return "/login.jsp";
	}

}
