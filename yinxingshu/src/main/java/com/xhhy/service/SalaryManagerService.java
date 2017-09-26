package com.xhhy.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.SalaryBean;

public interface SalaryManagerService {


	/**
	 * 薪酬管理  分页
	 */
	public PageInfo getSalarys(int nowPage,int pageSize,int num);
	
	/**
	 * 增加薪酬信息
	 */
	public void addSalary(SalaryBean sb);
	
	/**
	 *  准备获取薪酬编码的值 
	 */
	public int prepareCode();
}
