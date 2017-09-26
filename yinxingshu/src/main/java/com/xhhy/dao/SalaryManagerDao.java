package com.xhhy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.SalaryBean;

/**
 * 
 * @author 强悦
 * 薪酬管理dao层
 */
@Repository
public interface SalaryManagerDao {

	/**
	 * 查询所有薪酬标准
	 * @return
	 */
	
	public List<SalaryBean> findAll();
	
	/**
	 * 增加薪酬信息
	 */
	public void addSalary(SalaryBean sb);
	
	
	/**
	 *  准备获取薪酬编码的值 
	 */
	public int prepareCode();
}
