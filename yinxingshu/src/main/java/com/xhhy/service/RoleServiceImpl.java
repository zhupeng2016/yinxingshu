package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhhy.bean.RoleBean;
import com.xhhy.dao.RoleDao;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao rd;
	
	public List<RoleBean> getRoles() {
		// TODO Auto-generated method stub
		return rd.getRoles();
	}

}
