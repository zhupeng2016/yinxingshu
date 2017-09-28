package com.xhhy.bean;

import java.io.Serializable;

public class MingxiBean implements Serializable{

	private String deptName;
	private String archiveCode;
	private String userName;
	private String sex;
	private String roleName;
	private String salaryName;
	private String mobilePhone;
	private String archiveState;
	private String archivetime;
	private String oneTime;//模糊开始时间
	private String stateTime;//模糊借书时间
	private String deptId;
	
	
	public MingxiBean(String deptName, String archiveCode, String userName, String sex, String roleName,
			String salaryName, String mobilePhone, String archiveState, String archivetime, String oneTime,
			String stateTime, String deptId) {
		super();
		this.deptName = deptName;
		this.archiveCode = archiveCode;
		this.userName = userName;
		this.sex = sex;
		this.roleName = roleName;
		this.salaryName = salaryName;
		this.mobilePhone = mobilePhone;
		this.archiveState = archiveState;
		this.archivetime = archivetime;
		this.oneTime = oneTime;
		this.stateTime = stateTime;
		this.deptId = deptId;
	}
	public String getOneTime() {
		return oneTime;
	}
	public void setOneTime(String oneTime) {
		this.oneTime = oneTime;
	}
	public String getStateTime() {
		return stateTime;
	}
	public void setStateTime(String stateTime) {
		this.stateTime = stateTime;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public MingxiBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MingxiBean(String deptName, String archiveCode, String userName, String sex, String roleName,
			String salaryName, String mobilePhone, String archiveState, String archivetime) {
		super();
		this.deptName = deptName;
		this.archiveCode = archiveCode;
		this.userName = userName;
		this.sex = sex;
		this.roleName = roleName;
		this.salaryName = salaryName;
		this.mobilePhone = mobilePhone;
		this.archiveState = archiveState;
		this.archivetime = archivetime;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getArchiveCode() {
		return archiveCode;
	}
	public void setArchiveCode(String archiveCode) {
		this.archiveCode = archiveCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getSalaryName() {
		return salaryName;
	}
	public void setSalaryName(String salaryName) {
		this.salaryName = salaryName;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getArchiveState() {
		return archiveState;
	}
	public void setArchiveState(String archiveState) {
		this.archiveState = archiveState;
	}
	public String getArchivetime() {
		return archivetime;
	}
	public void setArchivetime(String archivetime) {
		this.archivetime = archivetime;
	}
	
	
	
	
	
}
