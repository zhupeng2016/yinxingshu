package com.xhhy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.bean.DeptBean;

@Repository
public interface DeptDao {
	
	//查询所有部门信息
	public List<DeptBean>  getAllDept();
	//添加一个部门
	public boolean addDept(DeptBean db);
	//根据Id查询部门信息。
	public DeptBean getDeptById(int deptId);

}
