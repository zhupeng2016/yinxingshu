package com.xhhy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xhhy.bean.TarBean;
@Repository
public interface TarDao {
	    //培训计划展现
		public List<TarBean> getTar(TarBean tb);
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
		public List<TarBean> fuList(TarBean tb);
		//培训复核查看
		public TarBean fuLook(int tarId);
		//培训复核提交
		public void fuUpdate(TarBean tb);
		//培训复核驳回
		public void bohui(TarBean tb);
		//培训反馈展现
		public List<TarBean> fanList(TarBean tb);
		//培训反馈查看
		public TarBean fanLook(int tarId);
		//培训反馈提交
		public void fanTi(TarBean tb);
}
