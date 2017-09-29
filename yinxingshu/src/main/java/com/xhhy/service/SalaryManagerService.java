package com.xhhy.service;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.RecordBean;
import com.xhhy.bean.SalaryBean;

public interface SalaryManagerService {


	/**
	 * 薪酬管理  分页
	 */
	public PageInfo getSalarys(SalaryBean sb,int pageNum,int pageSize,int num);
	
	/**
	 * 展示审核中的数据
	 * @param sb
	 * @param nowPage
	 * @param pageSize
	 * @param num
	 * @return
	 */
	public PageInfo getSalarySp(SalaryBean sb,int pageNum,int pageSize,int num);
	
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
	public void update(SalaryBean sb,int flag);
	
	/**
	 * 删除薪酬信息
	 */
	public void delete(int salaryId);
	

	/**
	 * 修改薪酬的状态
	 */
	public void updateState(int state,int salaryId);
	
	/**
	 * 展现发放工资数据
	 */
}

	
