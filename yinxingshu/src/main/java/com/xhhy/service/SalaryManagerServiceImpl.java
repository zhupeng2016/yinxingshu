package com.xhhy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
/**
 * 
 * @author 强悦
 * 薪酬标准管理service层
 */

import com.xhhy.bean.SalaryBean;
import com.xhhy.dao.SalaryManagerDao;
@Service
public class SalaryManagerServiceImpl implements SalaryManagerService {

	@Resource
	private SalaryManagerDao salaryManagerDao;

	public List<SalaryBean> findAll() {
		// TODO Auto-generated method stub
		return salaryManagerDao.findAll();
	}
}
