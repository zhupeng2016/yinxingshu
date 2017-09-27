package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhhy.bean.RecordBean;
import com.xhhy.dao.RecordManageDao;

@Service
public class RecordManageServiceImpl implements RecordManageService {

	
	
	@Autowired
	private RecordManageDao rmd;
	
	//添加档案
	public void insertRecord(RecordBean rb) {
		rmd.insertRecord(rb);
	}
	
	public PageInfo showAllRecords(int nowPage, int pageSize, int num, RecordBean rb) {
		PageHelper.startPage(nowPage,pageSize);
		List<RecordBean> list = rmd.showAllRecord(rb);
		PageInfo<Object>  info=new PageInfo(list,num);
		return info;
	}
	//明细
	public RecordBean queryOneRecord(int archiveId) {
		return rmd.queryOneRecord(archiveId);
	}

	public RecordBean pupdateOneRecord(int archiveId) {
		return rmd.pupdateOneRecord(archiveId);
	}
	public boolean updateOneRecord(RecordBean rb) {
		return rmd.updateOneRecord(rb);
	}

	
	

}
