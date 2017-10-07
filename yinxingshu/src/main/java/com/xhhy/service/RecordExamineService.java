package com.xhhy.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xhhy.bean.RecordBean;
import com.xhhy.bean.SalaryBean;


public interface RecordExamineService {
/*
 * 人事审批管理
 */

	//展现列表
	public List<RecordBean>  showAllRecordExamine();
	//明细
	public RecordBean queryOneRecord(int archiveId);
	
	
}
