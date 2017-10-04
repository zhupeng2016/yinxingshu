package com.xhhy.bean;

import java.io.Serializable;

public class UserBean implements Serializable {

	private int userId;// 
	private int deptId;// 外键
	private String userCode;// 用户编号
	private String loginName;// 登录帐号
	private String password;// 密码
	private String userName;// 登陆人
	private String sex;// 性别
	private String idCard;// 身份证号
	private String phone;// 座机号
	private String mobilePhone;// 手机号
	private String userEmail;// 邮箱
	private String address;// 地址
	private String userImg;// 图片
	private String userRemark;// 职位
	private String loginCount;// 登录次数
	private String userDel;// 状态
	private String userTime;
	private DeptBean db;// 链表
	private RoleBean rb;
	private int roleId;  // 职位id

	public String getUserTime() {
		return userTime;
	}

	public void setUserTime(String userTime) {
		this.userTime = userTime;
	}

	private ResumeBean reb;// 简历
	private RecordBean ab;// 档案

	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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

	public RecordBean getAb() {
		return ab;
	}

	public void setAb(RecordBean ab) {
		this.ab = ab;
	}

	public RoleBean getRb() {
		return rb;
	}

	public void setRb(RoleBean rb) {
		this.rb = rb;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}



	
	

	

}
