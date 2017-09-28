package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhhy.bean.ResumeBean;
import com.xhhy.dao.ResumeDao;

@Service
public class ResumeServiceImpl implements ResumeService {

	@Autowired
	private ResumeDao rsd;

	public List<ResumeBean> getResume() {
		// TODO Auto-generated method stub
		return rsd.getResume();
	}
	
	
	
}
