package com.xhhy.bean;

import java.io.Serializable;

public class UserBean implements Serializable {
	
	private int userId;//id5
	private int deptId;//澶栭敭
	private String userCode;//閮ㄩ棬缂栧彿
	private String loginName;//鐧诲綍甯愬彿
	private String password;//瀵嗙爜
	private String userName;//鐧婚檰浜�
	private String sex;//鎬у埆
	private String idCard;//韬唤璇佸彿
	private String phone;//搴ф満鍙�
	private String mobilePhone;//鎵嬫満鍙�
	private String userEail;//閭
	private String address;//鍦板潃
	private String userImg;//鍥剧墖
	private String userRemark;//鑱屼綅
	private String loginCount;//鐧诲綍娆℃暟
	private String userDel;//鐘舵�
	private DeptBean db;//部门
	private ResumeBean reb;//简历
	private ArchiveBean ab;//档案
	private RoleBean rb;//角色
	
	
	
	
	public DeptBean getDb() {
		return db;
	}
	public void setDb(DeptBean db) {
		this.db = db;
	}
	public ResumeBean getReb() {
		return reb;
	}
	public void setReb(ResumeBean reb) {
		this.reb = reb;
	}
	public ArchiveBean getAb() {
		return ab;
	}
	public void setAb(ArchiveBean ab) {
		this.ab = ab;
	}
	public RoleBean getRb() {
		return rb;
	}
	public void setRb(RoleBean rb) {
		this.rb = rb;
	}
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBean(int userId, int deptId, String userCode, String loginName, String password, String userName,
			String sex, String idCard, String phone, String mobilePhone, String userEail, String address,
			String userImg, String userRemark, String loginCount, String userDel) {
		super();
		this.userId = userId;
		this.deptId = deptId;
		this.userCode = userCode;
		this.loginName = loginName;
		this.password = password;
		this.userName = userName;
		this.sex = sex;
		this.idCard = idCard;
		this.phone = phone;
		this.mobilePhone = mobilePhone;
		this.userEail = userEail;
		this.address = address;
		this.userImg = userImg;
		this.userRemark = userRemark;
		this.loginCount = loginCount;
		this.userDel = userDel;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getUserEail() {
		return userEail;
	}
	public void setUserEail(String userEail) {
		this.userEail = userEail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public String getUserRemark() {
		return userRemark;
	}
	public void setUserRemark(String userRemark) {
		this.userRemark = userRemark;
	}
	public String getLoginCount() {
		return loginCount;
	}
	public void setLoginCount(String loginCount) {
		this.loginCount = loginCount;
	}
	public String getUserDel() {
		return userDel;
	}
	public void setUserDel(String userDel) {
		this.userDel = userDel;
	}
	
	
}
