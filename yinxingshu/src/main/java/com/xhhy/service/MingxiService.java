package com.xhhy.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.MingxiBean;
import com.xhhy.bean.RecordBean;

public interface MingxiService {
	//查询部门  员工 档案所有信息
	public PageInfo queryAll(int nowPage,int pageSize,int num,MingxiBean mb);
	//查询简历信息
		public PageInfo getqueryAll(int nowPage,int pageSize,int num,String user);
}
