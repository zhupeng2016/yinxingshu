package com.xhhy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.xhhy.bean.LogBean;


@Repository
public interface LogDao {
	
	public List<LogBean> getAllChanges();

	public List<LogBean> getYearChanges(@Param("year") String year);
}