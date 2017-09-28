package com.xhhy.bean;

import java.io.Serializable;

public class DeptBean implements Serializable {
	private int deptId;
	private String deptCode;
	private String deptShortName;
	private String deptName;
	private int parentDept;
	private String deptAddress;
	private String deptIntro;
	private String deptRemark;
	private int deptState;
	private int deptDel;

	public DeptBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeptBean(int deptId, String deptCode, String deptShortName, String deptName, int parentDept,
			String deptAddress, String deptIntro, String deptRemark, int deptState, int deptDel) {
		super();
		this.deptId = deptId;
		this.deptCode = deptCode;
		this.deptShortName = deptShortName;
		this.deptName = deptName;
		this.parentDept = parentDept;
		this.deptAddress = deptAddress;
		this.deptIntro = deptIntro;
		this.deptRemark = deptRemark;
		this.deptState = deptState;
		this.deptDel = deptDel;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptShortName() {
		return deptShortName;
	}
	public void setDeptShortName(String deptShortName) {
		this.deptShortName = deptShortName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getParentDept() {
		return parentDept;
	}
	public void setParentDept(int parentDept) {
		this.parentDept = parentDept;
	}
	public String getDeptAddress() {
		return deptAddress;
	}
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}
	public String getDeptIntro() {
		return deptIntro;
	}
	public void setDeptIntro(String deptIntro) {
		this.deptIntro = deptIntro;
	}
	public String getDeptRemark() {
		return deptRemark;
	}
	public void setDeptRemark(String deptRemark) {
		this.deptRemark = deptRemark;
	}
	public int getDeptState() {
		return deptState;
	}
	public void setDeptState(int deptState) {
		this.deptState = deptState;
	}
	public int getDeptDel() {
		return deptDel;
	}
	public void setDeptDel(int deptDel) {
		this.deptDel = deptDel;
	}
	
	
	
	

}
