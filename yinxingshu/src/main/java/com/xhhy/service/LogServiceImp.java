package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhhy.bean.LogBean;
import com.xhhy.dao.LogDao;
@Service
public class LogServiceImp implements LogService {
	@Autowired
	private LogDao logd;

	/**
	 * 查询各年各部门的人员变更
	 */
	public List<LogBean> getAllChanges() {

		return logd.getAllChanges();
		

	}
	/**
	 * 查询当年各月各部门的人员变更
	 * @param year 哪一年
	 */

	public List<LogBean> getYearChanges(String year) {
		// TODO Auto-generated method stub
		return logd.getYearChanges(year);
	}

}
