package com.xhhy.bean;

import java.io.Serializable;

public class UserBean implements Serializable {
	
	private int userId;//id
	private int deptId;//外键
	private String userCode;//部门编号
	private String loginName;//登录帐号
	private String password;//密码
	private String userName;//登陆人
	private String sex;//性别
	private String idCard;//身份证号
	private String phone;//座机号
	private String mobilePhone;//手机号
	private String userEmail;//邮箱
	private String address;//地址
	private String userImg;//图片
	private String userRemark;//职位
	private String loginCount;//登录次数
	private String userDel;//状态
	private String userTime;
	private DeptBean db;//链表
	private RoleBean rb;
	
	
	public UserBean(int userId, int deptId, String userCode, String loginName, String password, String userName,
			String sex, String idCard, String phone, String mobilePhone, String userEmail, String address,
			String userImg, String userRemark, String loginCount, String userDel, String userTime, DeptBean db,
			RoleBean rb) {
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
		this.userEmail = userEmail;
		this.address = address;
		this.userImg = userImg;
		this.userRemark = userRemark;
		this.loginCount = loginCount;
		this.userDel = userDel;
		this.userTime = userTime;
		this.db = db;
		this.rb = rb;
	}
	public String getUserTime() {
		return userTime;
	}
	public void setUserTime(String userTime) {
		this.userTime = userTime;
	}
	public UserBean(int userId, int deptId, String userCode, String loginName, String password, String userName,
			String sex, String idCard, String phone, String mobilePhone, String userEmail, String address,
			String userImg, String userRemark, String loginCount, String userDel, DeptBean db, RoleBean rb) {
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
		this.userEmail = userEmail;
		this.address = address;
		this.userImg = userImg;
		this.userRemark = userRemark;
		this.loginCount = loginCount;
		this.userDel = userDel;
		this.db = db;
		this.rb = rb;
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
			String sex, String idCard, String phone, String mobilePhone, String userEmail, String address,
			String userImg, String userRemark, String loginCount, String userDel, DeptBean db) {
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
		this.userEmail = userEmail;
		this.address = address;
		this.userImg = userImg;
		this.userRemark = userRemark;
		this.loginCount = loginCount;
		this.userDel = userDel;
		this.db = db;
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
	
	
}
