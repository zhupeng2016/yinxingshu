package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhhy.bean.MingxiBean;
import com.xhhy.bean.ResumeBean;
import com.xhhy.dao.MingxiDao;
@Service
public class MingxiServiceImpl implements MingxiService {
	@Autowired
     private MingxiDao md;
	@Override
	public PageInfo queryAll(int pageNum,int pageSize,int num,MingxiBean mb) {
		PageHelper.startPage(pageNum,pageSize);
		List<MingxiBean> l = md.queryAll(mb);
		PageInfo<Object> info = new PageInfo(l,num);
		return info;
	}
	//查询简历信息
		public PageInfo  getqueryAll(int pageNum,int pageSize,int num,String user){
			PageHelper.startPage(pageNum,pageSize);
			List<ResumeBean> l=md.getqueryAll(user);
			PageInfo<Object> info = new PageInfo(l,num);
			return info;
		}

}
