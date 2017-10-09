package com.xhhy.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.EducationBean;
import com.xhhy.bean.GuanliBean;
import com.xhhy.bean.MingxiBean;
import com.xhhy.bean.YearBean;

public interface MingxiService {
	//查询部门  员工 档案所有信息
	public PageInfo queryAll(int nowPage,int pageSize,int num,MingxiBean mb);
	//查询简历信息
		public PageInfo getqueryAll(int nowPage,int pageSize,int num,String user);
		//查询所有每年学历人数
		public List<EducationBean> geteducation(int educationId);
		public List<EducationBean> geteducationa();
		//查询所有部门学历人数
		public List<YearBean> getyear(int educationId,int deptId);
		public List<GuanliBean> getzhixian(int guanliId);
		public List<GuanliBean> getzhixiana();
}
