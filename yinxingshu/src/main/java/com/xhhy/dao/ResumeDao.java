package com.xhhy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xhhy.bean.ResumeBean;

@Repository
public interface ResumeDao {
	
	
	//展现简历列表
	public List<ResumeBean> getResume();

}
