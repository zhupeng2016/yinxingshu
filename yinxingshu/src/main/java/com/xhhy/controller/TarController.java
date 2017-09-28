package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.TarBean;
import com.xhhy.service.TarService;
import com.xhhy.util.StateTar;

@Controller
@RequestMapping("/peixun")
@SessionAttributes({"tarBean"})
public class TarController {
		@Autowired
		private TarService ts;
	//培训计划展现
	@RequestMapping("/info")
	public String  info(TarBean tb,@RequestParam(value="flag",required=false)String flag,@RequestParam("pageNum") int pageNum,Model m){
		if("clear".equals(flag)){
		     tb.setTarName(null);
		     tb.setTarState(999);
		     tb.setTarStartTime(null);
		     tb.setTarEddTime(null);
		}
		PageInfo page = ts.getTar(tb,pageNum, StateTar.PAGESIZE, StateTar.NUM);
		List<TarBean> l = page.getList();	
		m.addAttribute("tarBean", tb);
		m.addAttribute("l",l);
		m.addAttribute("page",page);
		return "peixunjihua/list.jsp";
	}
	
	//培训计划增加
	@RequestMapping("/add")
	public String addTar(TarBean tb,int pageNum,Model m){
		tb.setTarState(StateTar.UNTAR_STATE);
		ts.addTar(tb);	
		return info(new TarBean(),"clear",pageNum,m);
	}
	//培训计划查看
	@RequestMapping("/view")
	public String lookTar(int tarId,int pageNum,Model m){
		TarBean tb = ts.lookTar(tarId);
		m.addAttribute("tb",tb);
		m.addAttribute("pageNum",pageNum);
		return "peixunjihua/view.jsp";
	}
	//培训计划删除
	@RequestMapping("/delete")
	public String deleteTar(int tarId,int pageNum,Model m){
		ts.deleteTar(tarId);
		return info(new TarBean(),"clear",pageNum,m);
	}
	//培训计划修改
		@RequestMapping("/see")
		public String seeTar(int tarId,int pageNum,Model m){
			TarBean tb = ts.lookTar(tarId);
			m.addAttribute("tb",tb);
			m.addAttribute("pageNum",pageNum);
			return "peixunjihua/edit.jsp";
		}
	//培训计划修改
	@RequestMapping("/update")
	public String updateTar(int pageNum,TarBean tb,Model m){
		ts.updateTar(tb);
		return info(new TarBean(),"clear",pageNum,m);
	}
	//培训计划申请复核
	@RequestMapping("/fuhe")
	public String fuhe(int tarId,int pageNum,Model m){
		ts.fuheTar(tarId);
		return info(new TarBean(),"clear",pageNum,m);
	}
	//培训计划培训结果
	@RequestMapping("/result")
	public String resultTar(int tarId,int pageNum,Model m){
		TarBean tb = ts.lookTar(tarId);
		m.addAttribute("tb", tb);
		m.addAttribute("pageNum",pageNum);
		return "peixunjihua/result.jsp";
	}
	//培训复核展现
	@RequestMapping("/shenhe")
	public String fuList(TarBean tb,@RequestParam(value="flag",required=false)String flag,int pageNum,Model m){
		if("clear".equals(flag)){
		     tb.setTarName(null);
		     tb.setTarStartTime(null);
		     tb.setTarEddTime(null);
		}
		PageInfo page = ts.fuList(pageNum, StateTar.PAGESIZE, StateTar.NUM,tb);
		List<TarBean> l = page.getList();	
		m.addAttribute("tarBean", tb);
		m.addAttribute("l",l);
		m.addAttribute("page",page);
		return "peixunfuhe/list.jsp";
	}
	//培训复核查看
	@RequestMapping("/hefu")
	public String fuLook(int tarId,int pageNum,Model m){
		TarBean tb = ts.fuLook(tarId);
		m.addAttribute("tb", tb);
		m.addAttribute("pageNum", pageNum);
		return "peixunfuhe/fuhe.jsp";
	}
	//培训复核提交
	@RequestMapping("/tijiao")
	public String fuTi(int pageNum,TarBean tb,Model m){
		ts.fuUpdate(tb);
		return fuList(new TarBean(),"clear",pageNum,m);
	}
	//培训复核驳回
	@RequestMapping("/bohui")
	public String boHui(int pageNum,TarBean tb,Model m){
		ts.bohui(tb);
		return fuList(new TarBean(),"clear",pageNum,m);
	}
	//培训反馈展现
	@RequestMapping("/fankui")
	public String  fanList(@RequestParam(value="flag",required=false)String flag,int pageNum,TarBean tb,Model m){
		if("clear".equals(flag)){
		     tb.setTarName(null);
		     tb.setTarStartTime(null);
		     tb.setTarEddTime(null);
		}
		PageInfo page = ts.fanList(pageNum, StateTar.PAGESIZE, StateTar.NUM,tb);
		List<TarBean> l = page.getList();	
		m.addAttribute("tarBean", tb);
		m.addAttribute("l",l);
		m.addAttribute("page",page);
		return "peixunfankui/list.jsp";
	}
	//培训反馈查看
	@RequestMapping("/fankan")
	public String fanUpdate(int tarId,int pageNum,Model m){
		TarBean tb = ts.fanLook(tarId);
		m.addAttribute("tb", tb);
		m.addAttribute("pageNum", pageNum);
		return "peixunfankui/fankui.jsp";
	}
	//培训反馈提交
	@RequestMapping("/extra")
	public String fanTi(int pageNum,TarBean tb,Model m){
		ts.fanTi(tb);
		return fanList("clear",pageNum,new TarBean(),m);
	}
	
}
