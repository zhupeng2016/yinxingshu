package com.xhhy.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.TarBean;

public interface TarService {
	//培训计划分页
	public PageInfo getTar(int nowPage,int pageSize,int num);
	//培训计划模糊查
	public List<TarBean> autoList(TarBean tb);
	//培训计划增加
	public void addTar(TarBean tb);
	//培训计划查看
	public TarBean lookTar(int tarId);
	//培训计划删除
	public void deleteTar(int tarId);
	//培训计划修改
	public void updateTar(TarBean tb);
	//培训计划复核
	public void fuheTar(int tarId);
	//培训复核展现
	public PageInfo fuList(int nowPage,int pageSize,int num,TarBean tb);
	//培训复核查看
	public TarBean fuLook(int tarId);
	//培训复核提交
	public void fuUpdate(TarBean tb);
	//培训复核驳回
	public void bohui(TarBean tb);
	//培训反馈展现
	public PageInfo fanList(int nowPage,int pageSize,int num,TarBean tb);
	//培训反馈查看
	public TarBean fanLook(int tarId);
	//培训反馈提交
	public void fanTi(TarBean tb);
}
