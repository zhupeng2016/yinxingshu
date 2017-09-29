package com.xhhy.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.RecordBean;

public interface RecordManageService {
	/*
	 * 展现人事档案管理(包括分页,包括模糊查询)
	 */
	public PageInfo showAllRecords(int nowPage,int pageSize,int num,RecordBean rb);
         
	/*
	 * 添加的方法
	 */
	public void insertRecord(RecordBean rb);
	/*
	 * 根据id查询一条档案记录
	 */
	public RecordBean queryOneRecord(int archiveId);
	//public abstract List<Map<String,Obiect>> findById(int id);
	/*
	 * 预修改的方法
	 */
	public RecordBean pupdateOneRecord(int archiveId);
	/*
	 * 修改的方法
	 */
	public boolean updateOneRecord(RecordBean rb);

	
	

}
