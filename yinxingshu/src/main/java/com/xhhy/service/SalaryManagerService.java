package com.xhhy.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.RecordBean;
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
	
	/**
	 * 查看薪酬详细信息
	 */
	public SalaryBean message(int salaryId);
	
	/**
	 * 修改薪酬信息
	 */
	public void update(SalaryBean sb);
	
	/**
	 * 删除薪酬信息
	 */
	public void delete(int salaryId);
	/*
	 * 吴占喜加finall()方法
	 */
	public List<SalaryBean> findAll();
}
