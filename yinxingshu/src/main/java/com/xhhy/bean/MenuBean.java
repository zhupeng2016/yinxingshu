package com.xhhy.bean;

import java.io.Serializable;

public class MenuBean implements Serializable {
	private int menuId;
	private String menuName;
	private int parentMenu;
	private String url;
	private int menuState;
	private int menuDel;
	private String menuRemark;
	private boolean is;
	public MenuBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MenuBean(int menuId, String menuName, int parentMenu, String url, int menuState, int menuDel,
			String menuRemark) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.parentMenu = parentMenu;
		this.url = url;
		this.menuState = menuState;
		this.menuDel = menuDel;
		this.menuRemark = menuRemark;
	}
	
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getParentMenu() {
		return parentMenu;
	}
	public void setParentMenu(int parentMenu) {
		this.parentMenu = parentMenu;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getMenuState() {
		return menuState;
	}
	public void setMenuState(int menuState) {
		this.menuState = menuState;
	}
	public int getMenuDel() {
		return menuDel;
	}
	public void setMenuDel(int menuDel) {
		this.menuDel = menuDel;
	}
	public String getMenuRemark() {
		return menuRemark;
	}
	public void setMenuRemark(String menuRemark) {
		this.menuRemark = menuRemark;
	}

	public boolean isIs() {
		return is;
	}

	public void setIs(boolean is) {
		this.is = is;
	}
	
	
	
	

}
