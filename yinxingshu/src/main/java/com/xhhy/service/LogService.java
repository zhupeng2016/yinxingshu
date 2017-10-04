package com.xhhy.service;

import java.util.List;

import com.xhhy.bean.LogBean;

public interface LogService {

	public List<LogBean> getAllChanges();
	
	public List<LogBean> getYearChanges(String year);
}
