package com.xhhy.dao;
/*
 * 人事审批管理
 */
import java.util.List;

import com.xhhy.bean.RecordBean;

public interface RecordExamineDao {

	//展现列表
		public List<RecordBean>  showAllRecordExamine();
		//办理
		public RecordBean queryOneRecord(int archiveId);
}
