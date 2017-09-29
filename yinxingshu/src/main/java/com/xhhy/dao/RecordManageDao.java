package com.xhhy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xhhy.bean.RecordBean;

@Repository
public interface RecordManageDao {
       //展现所有的,包括查询条件
	public List<RecordBean> showAllRecord(RecordBean rb);
	//
	public void insertRecord(RecordBean rb);
	/*
	 * 根据id查询一条档案记录
	 */
	public RecordBean queryOneRecord(int archiveId);
	/*
	 * 预修改的方法
	 */
	public RecordBean  pupdateOneRecord(int archiveId);
	/*
	 * 修改的方法
	 */
	public boolean updateOneRecord(RecordBean rb);

}
