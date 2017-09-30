package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhhy.bean.EducationBean;
import com.xhhy.bean.MingxiBean;
import com.xhhy.bean.ResumeBean;
import com.xhhy.bean.YearBean;
import com.xhhy.dao.MingxiDao;

@Service
public class MingxiServiceImpl implements MingxiService {
	@Autowired
	private MingxiDao md;

	public PageInfo queryAll(int pageNum, int pageSize, int num, MingxiBean mb) {
		PageHelper.startPage(pageNum, pageSize);
		List<MingxiBean> l = md.queryAll(mb);
		PageInfo<Object> info = new PageInfo(l, num);
		return info;
	}

	// 查询简历信息
	public PageInfo getqueryAll(int pageNum, int pageSize, int num, String user) {
		PageHelper.startPage(pageNum, pageSize);
		List<ResumeBean> l = md.getqueryAll(user);
		PageInfo<Object> info = new PageInfo(l, num);
		return info;
	}
	
	
	
	//查询所有每年学历人数
		
		public List<EducationBean> geteducationa(){
			List<EducationBean> list = md.geteducationa();
			EducationBean l = md.gettongji();
			boolean is=false;
			for (int i = 0; i < list.size(); i++) {
				String time=list.get(i).getTime();
				if(time.equals(l.getTime())){
					is=true;
				}
			}
			if(is){
				//修改方法
				md.getupdete(l);
			}else{
				//添加方法
				md.getinsert(l);
			}
			return md.geteducationa();
		}
		public List<EducationBean> geteducation(int educationId){
			return md.geteducation(educationId);
		}
		
		
		//查询所有部门学历人数
		/* (non-Javadoc)
		 * @see com.xhhy.service.MingxiService#getyear(int, int)
		 */
		public List<YearBean> getyear(int educationId,int deptId){
			
			return md.getyear(educationId,deptId);
		}

}
