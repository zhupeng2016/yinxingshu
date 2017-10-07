package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.RecordBean;
import com.xhhy.dao.RecordExamineDao;

@Service
public class RecordExamineServiceImpl implements RecordExamineService {

	@Autowired
	private RecordExamineDao red;
	//
	public List<RecordBean> showAllRecordExamine() {
		return red.showAllRecordExamine();
	}
	//明细
	public RecordBean queryOneRecord(int archiveId) {
		return red.queryOneRecord(archiveId);
	}

	

}
