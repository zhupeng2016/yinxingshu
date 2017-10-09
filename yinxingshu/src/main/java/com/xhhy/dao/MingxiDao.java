package com.xhhy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xhhy.bean.EducationBean;
import com.xhhy.bean.GuanliBean;
import com.xhhy.bean.MingxiBean;
import com.xhhy.bean.ResumeBean;
import com.xhhy.bean.YearBean;

public interface MingxiDao {
	//查询部门  员工 档案所有信息
	public List<MingxiBean> queryAll(MingxiBean mb);
	//查询简历信息
	public List<ResumeBean> getqueryAll(@Param("user")String user);
	//查询所有每年学历人数
	public List<EducationBean> geteducation(@Param("educationId")int educationId);
	public List<EducationBean> geteducationa();
	//统计所有信息
	public EducationBean gettongji();
	//添加统计的数据
	public void getinsert(EducationBean l);
	//修改统计的数据
	public void getupdete(EducationBean l);
	
	//查询所有部门学历人数
	public List<YearBean> getyear(@Param("educationId")int educationId,@Param("deptId")int deptId);
	
	 
	public List<GuanliBean>  getzhixian(@Param("guanliId")int guanliId);
	public List<GuanliBean>  getzhixiana();
}
