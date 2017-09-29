package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhhy.bean.RecordBean;
import com.xhhy.bean.SalaryBean;
import com.xhhy.dao.SalaryManagerDao;
import com.xhhy.util.State;
@Service
public class SalaryManagerServiceImpl implements SalaryManagerService {

	@Autowired
	private SalaryManagerDao salaryManagerDao;

	/**
	 * 薪酬管理 分页
	 */
	public PageInfo getSalarys(SalaryBean sb,int pageNum, int pageSize, int num) {
		List<SalaryBean> l = null;
		PageInfo<Object> info = null;
		PageHelper.startPage(pageNum, pageSize);
		l = salaryManagerDao.findAll(sb);
		info = new PageInfo(l,num);
		int c = info.getPages();
		if(pageNum > c){
			PageHelper.startPage(c, pageSize);
			l = salaryManagerDao.findAll(sb);
			info = new PageInfo(l,num);
		}
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
	
	
	/**
	 * 查看薪酬标准详情
	 */
	public SalaryBean message(int salaryId) {
		// TODO Auto-generated method stub
		return salaryManagerDao.message(salaryId);
	}
	

	/**
	 * 修改薪酬详情
	 */
	/*@Transactional*/
	public void update(SalaryBean sb,int flag) {
		// TODO Auto-generated method stub
		//flag是1只修改
		//flag是2除了修改还得修改审核状态
		salaryManagerDao.update(sb);
		if(flag == 2){
			salaryManagerDao.updateState(State.SALARY_SHENHEZHONG,sb.getSalaryId());
		}
	}
	
	
	/**
	 * 删除薪酬信息
	 */
	public void delete(int salaryId) {
		// TODO Auto-generated method stub
		salaryManagerDao.delete(salaryId);
	}

	/**
	 * 修改薪酬的状态
	 */
	public void updateState(int state, int salaryId) {
		// TODO Auto-generated method stub
		salaryManagerDao.updateState(state, salaryId);
	}

	/**
	 * 展示审核中的信息
	 */
	public PageInfo getSalarySp(SalaryBean sb, int pageNum, int pageSize, int num) {
		List<SalaryBean> l = null;
		PageInfo<Object> info = null;
		PageHelper.startPage(pageNum, pageSize);
		l = salaryManagerDao.findSp(sb);
		info = new PageInfo(l,num);
		int c = info.getPages();
		if(pageNum > c){
			PageHelper.startPage(c, pageSize);
			l = salaryManagerDao.findSp(sb);
			info = new PageInfo(l,num);
		}
		return info;
	}

	/**
	 * 展现发放工资数据
	 */

	
	
	
	
}
