package com.xhhy.dao;

import java.util.List;

import com.xhhy.bean.SalaryBean;

/**
 * 
 * @author 强悦
 * 薪酬管理dao层
 */
public interface SalaryManagerDao {

	/**
	 * 查询所有薪酬标准
	 * @return
	 */
	public List<SalaryBean> findAll();
	

}
