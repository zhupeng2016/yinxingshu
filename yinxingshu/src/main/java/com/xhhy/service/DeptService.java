package com.xhhy.service;

import java.util.List;

import com.xhhy.bean.DeptBean;

public interface DeptService {

	//查询所有部门信息
	public List<DeptBean> getAllDept();
    //添加一个部门
	public boolean addDept(DeptBean db);
	//根据Id查询部门信息。
	public DeptBean getDeptById(int deptId);
}
