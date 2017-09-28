package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.TarBean;
import com.xhhy.service.TarService;
import com.xhhy.util.StateTar;

@Controller
@RequestMapping("/peixun")
public class TarController {
		@Autowired
		private TarService ts;
	//培训计划展现
	@RequestMapping("/info")
	public String  info(@RequestParam("pageNum") int pageNum,Model m){
		PageInfo page = ts.getTar(pageNum, StateTar.PAGESIZE, StateTar.NUM);
		List<TarBean> l = page.getList();	
		m.addAttribute("l",l);
		m.addAttribute("page",page);
		return "peixunjihua/list.jsp";
	}
	//培训计划模糊查
	@RequestMapping("/auto")
	public String autoTar(TarBean tb,int pageNum,Model m){
		List<TarBean> l =ts.autoList(tb);
		m.addAttribute("li",l);
		return info(pageNum,m);
	}
	//培训计划增加
	@RequestMapping("/add")
	public String addTar(TarBean tb,int pageNum,Model m){
		tb.setTarState(StateTar.UNTAR_STATE);
		ts.addTar(tb);	
		return info(pageNum,m);
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
		return info(pageNum,m);
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
		return info(pageNum,m);
	}
	//培训计划申请复核
	@RequestMapping("/fuhe")
	public String fuhe(int tarId,int pageNum,Model m){
		ts.fuheTar(tarId);
		return info(pageNum,m);
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
	public String fuList(int pageNum,TarBean tb,Model m){
		PageInfo page = ts.fuList(pageNum, StateTar.PAGESIZE, StateTar.NUM,tb);
		List<TarBean> l = page.getList();	
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
		return fuList(pageNum,tb,m);
	}
	//培训复核驳回
	public String boHui(int pageNum,TarBean tb,Model m){
		ts.bohui(tb);
		return fuList(pageNum,tb,m);
	}
	//培训反馈展现
	@RequestMapping("/fankui")
	public String  fanList(int pageNum,TarBean tb,Model m){
		PageInfo page = ts.fanList(pageNum, StateTar.PAGESIZE, StateTar.NUM,tb);
		List<TarBean> l = page.getList();	
		m.addAttribute("l",l);
		m.addAttribute("page",page);
		return "peixunfankui/list.jsp";
	}
	//培训反馈查看
	@RequestMapping("/kuifan")
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
		return fanList(pageNum,tb,m);
	}
	
}
