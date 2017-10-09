package com.xhhy.bean;

import java.io.Serializable;

public class GuanliBean implements Serializable {
	private int guanliId;
	private String yean;
	private String gaoceng;
	private String diceng;
	private String yewu;
	private String zhineng;
	private String jishu;
	
	
	
	public GuanliBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GuanliBean(int guanliId, String yean, String gaoceng, String diceng, String yewu, String zhineng,
			String jishu) {
		super();
		this.guanliId = guanliId;
		this.yean = yean;
		this.gaoceng = gaoceng;
		this.diceng = diceng;
		this.yewu = yewu;
		this.zhineng = zhineng;
		this.jishu = jishu;
	}
	public int getGuanliId() {
		return guanliId;
	}
	public void setGuanliId(int guanliId) {
		this.guanliId = guanliId;
	}
	public String getYean() {
		return yean;
	}
	public void setYean(String yean) {
		this.yean = yean;
	}
	public String getGaoceng() {
		return gaoceng;
	}
	public void setGaoceng(String gaoceng) {
		this.gaoceng = gaoceng;
	}
	public String getDiceng() {
		return diceng;
	}
	public void setDiceng(String diceng) {
		this.diceng = diceng;
	}
	public String getYewu() {
		return yewu;
	}
	public void setYewu(String yewu) {
		this.yewu = yewu;
	}
	public String getZhineng() {
		return zhineng;
	}
	public void setZhineng(String zhineng) {
		this.zhineng = zhineng;
	}
	public String getJishu() {
		return jishu;
	}
	public void setJishu(String jishu) {
		this.jishu = jishu;
	}
	

}
