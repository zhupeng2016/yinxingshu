package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhhy.bean.TarBean;
import com.xhhy.dao.TarDao;

@Service
public class TarServiceImpl implements TarService {
	@Autowired
	private TarDao td;

	// 培训计划分页
	public PageInfo getTar(TarBean tb,int pageNum, int pageSize, int num) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<TarBean> l = td.getTar(tb);
		PageInfo<Object> info = new PageInfo(l, num);
		return info;
	}
	//培训计划增加
	public void addTar(TarBean tb) {
		// TODO Auto-generated method stub
		td.addTar(tb);
	}
	//培训计划查看
	public TarBean lookTar(int tarId) {
		// TODO Auto-generated method stub
		return td.lookTar(tarId);
	}
	//培训计划删除
	public void deleteTar(int tarId) {
		// TODO Auto-generated method stub
		td.deleteTar(tarId);
	}
	//培训计划修改
	public void updateTar(TarBean tb) {
		// TODO Auto-generated method stub
		td.updateTar(tb);
	}
	//培训计划复核
	public void fuheTar(int tarId) {
		// TODO Auto-generated method stub
		td.fuheTar(tarId);
	}
	//培训复核展现
	public PageInfo fuList(int pageNum, int pageSize, int num, TarBean tb) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<TarBean> l = td.fuList(tb);
		PageInfo<Object> info = new PageInfo(l, num);
		return info;
	}
	//培训复核查看
	public TarBean fuLook(int tarId) {
		// TODO Auto-generated method stub
		return td.fuLook(tarId);
	}
	//培训复核提交
	public void fuUpdate(TarBean tb) {
		// TODO Auto-generated method stub
		td.fuUpdate(tb);
	}
	//培训复核驳回
	public void bohui(TarBean tb) {
		// TODO Auto-generated method stub
		td.bohui(tb);
	}
	//培训反馈展现		
	public PageInfo fanList(int pageNum, int pageSize, int num, TarBean tb) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<TarBean> l = td.fanList(tb);
		PageInfo<Object> info = new PageInfo(l, num);
		return info;
	}
	//培训反馈查看
	public TarBean fanLook(int tarId) {
		// TODO Auto-generated method stub
		return td.fanLook(tarId);
	}
	//培训反馈提交
	public void fanTi(TarBean tb) {
		// TODO Auto-generated method stub
		td.fanTi(tb);
	}
}
