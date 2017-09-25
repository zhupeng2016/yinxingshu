package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhhy.bean.DeptBean;
import com.xhhy.dao.DeptDao;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao dd;
	
	//查询所有部门信息
	@Override
	public List<DeptBean> getAllDept() {
		// TODO Auto-generated method stub
		return dd.getAllDept();
	}

	//添加一个部门
	@Override
	public boolean addDept(DeptBean db) {
		// TODO Auto-generated method stub
		
		return dd.addDept(db);
	}

	//根据Id查询部门信息。
	@Override
	public DeptBean getDeptById(int deptId) {
		// TODO Auto-generated method stub
		return dd.getDeptById(deptId);
	}

}