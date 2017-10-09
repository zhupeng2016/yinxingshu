package com.xhhy.service;

import java.util.List;

import com.xhhy.bean.ResumeBean;

public interface ResumeService {

	//展现简历列表
	public List<ResumeBean> getResume();
	
	
	//查看简历用户信息
	public ResumeBean viewResume(Integer resumeId);
	
	//预修改查询
	public ResumeBean pupdateResuem(Integer resumeId);
	
	
	//修改
	public boolean updateResume(Integer resumeId);
	
	//添加简历用户
	public boolean addResume();
}
