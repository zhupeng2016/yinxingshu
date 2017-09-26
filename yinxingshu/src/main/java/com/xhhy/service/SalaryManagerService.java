package com.xhhy.service;

import java.util.List;

import com.xhhy.bean.SalaryBean;

public interface SalaryManagerService {

	/**
	 * 查询所有薪酬标准
	 * @return
	 */
	public List<SalaryBean> findAll();
}
