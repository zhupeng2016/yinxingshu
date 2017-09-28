package com.xhhy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xhhy.bean.MingxiBean;
import com.xhhy.bean.ResumeBean;

public interface MingxiDao {
	//查询部门  员工 档案所有信息
	public List<MingxiBean> queryAll(MingxiBean mb);
	//查询简历信息
	public List<ResumeBean> getqueryAll(@Param("user")String user);

}
