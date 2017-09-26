package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author 强悦
 * 薪酬标准管理service层
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhhy.bean.SalaryBean;
import com.xhhy.dao.SalaryManagerDao;
@Service
public class SalaryManagerServiceImpl implements SalaryManagerService {

	@Autowired
	private SalaryManagerDao salaryManagerDao;

	/*public List<SalaryBean> findAll() {
		// TODO Auto-generated method stub
		return salaryManagerDao.findAll();
	}*/
	/**
	 * 薪酬管理 分页
	 */
	public PageInfo getSalarys(int pageNum, int pageSize, int num) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<SalaryBean> l = salaryManagerDao.findAll();
		PageInfo<Object> info = new PageInfo(l,num);
		return info;

	}

	/**
	 * 增加薪酬信息
	 */
	public void addSalary(SalaryBean sb) {
		// TODO Auto-generated method stub
		salaryManagerDao.addSalary(sb);
	}

	/**
	 *  准备获取薪酬编码的值 
	 */
	public int prepareCode() {
		// TODO Auto-generated method stub
		return salaryManagerDao.prepareCode();
	}
	
	
	
}
