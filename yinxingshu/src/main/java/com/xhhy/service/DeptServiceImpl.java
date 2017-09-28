package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhhy.bean.DeptBean;
import com.xhhy.dao.DeptDao;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	public DeptDao dd;
	
	//查询所有部门信息
	
	public List<DeptBean> getAllDept() {
		// TODO Auto-generated method stub
		return dd.getAllDept();
	}

	//添加一个部门
	public boolean addDept(DeptBean db) {
		// TODO Auto-generated method stub
		
		return dd.addDept(db);
	}

	//根据Id查询部门信息。
	public DeptBean getDeptById(int deptId) {
		// TODO Auto-generated method stub
		return dd.getDeptById(deptId);
	}

	//根据Id状态删除部门。
	public boolean deleteDeptById(int deptId) {
		// TODO Auto-generated method stub
		return dd.deleteDeptById(deptId);
	}

	//根据Id修改部门信息。
	public boolean updateDept(DeptBean db) {
		// TODO Auto-generated method stub
		return dd.updateDept(db);
	}

}
