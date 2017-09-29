package com.xhhy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.xhhy.bean.RecordBean;
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
	
	public List<SalaryBean> findAll(SalaryBean sb);
	
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
	
	/**
	 * 修改薪酬的状态
	 * @param state
	 */
	public void updateState(@Param("st")int state,@Param("si")int salaryId);
	
	/**
	 * 查询审核中的数据
	 * @param sb
	 */
	public List<SalaryBean> findSp(SalaryBean sb);
	
	
	/**
	 * 展现发放工资数据
	 */
	
}

