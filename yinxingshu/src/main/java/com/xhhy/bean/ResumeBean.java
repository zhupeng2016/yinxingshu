
package com.xhhy.bean;

import java.io.Serializable;
import java.util.List;

public class ResumeBean implements Serializable {
	private Integer resumeId; // 简历Id 主键
	private Integer userId; // 职员Id 外键
	private String name; // 职员姓名
	private Integer resumeSex; // 职员性别
	private String resumeEmail; // 职员email
	private String resumePhone; // 职员电话
	private String localAddress; // 户口所在地
	private String homeAddress; // 住址
	private String political; // 政治面貌
	private String cardId; // 简历的身份证号
	private String salaryRequire; // 薪资要求
	private String graduateSchool; // 毕业院校
	private Integer education; // 学历
	private String major; // 专业
	private Integer jobState;// 是否在职 0:在职； 1:离职 ；
	private Integer freshStudent; // 是否应届生 0:是； 1:否；
	private Integer workYear; // 工作时间
	private String personResume; // 个人履历
	private String personFile; // 家庭关系信息
	private Integer recommendState; // 推荐状态 0:推荐； 1:不推荐
	private String recommendTime; // 推荐时间
	private String recommendIdea; // 推荐意见F
	private String interviewResult; // 录用结果
	private String interviewTime; // 面试时间
	private String resolutionTime; // 决议时间
	private String attributeMianshi;// 是否面试过
	private Integer resumeDel;// 是否删除
	private Integer roleId;// 职位主键
	private List<RoleBean> role; // 职位对象
	private UserBean user; // 职员对象
	private String roleName;// 职位名称
	private String startTime;// 登记时间

	public Integer getResumeDel() {
		return resumeDel;
	}

	public void setResumeDel(Integer resumeDel) {
		this.resumeDel = resumeDel;
	}

	public String getAttributeMianshi() {
		return attributeMianshi;
	}

	public void setAttributeMianshi(String attributeMianshi) {
		this.attributeMianshi = attributeMianshi;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Integer getRoleId() {

		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public List<RoleBean> getRole() {
		return role;
	}

	public void setRole(List<RoleBean> role) {
		this.role = role;
	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public Integer getResumeId() {
		return resumeId;
	}

	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getResumeSex() {
		return resumeSex;
	}

	public void setResumeSex(Integer resumeSex) {
		this.resumeSex = resumeSex;
	}

	public String getResumeEmail() {
		return resumeEmail;
	}

	public void setResumeEmail(String resumeEmail) {
		this.resumeEmail = resumeEmail;
	}

	public String getResumePhone() {
		return resumePhone;
	}

	public void setResumePhone(String resumePhone) {
		this.resumePhone = resumePhone;
	}

	public String getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getPolitical() {
		return political;
	}

	public void setPolitical(String political) {
		this.political = political;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getSalaryRequire() {
		return salaryRequire;
	}

	public void setSalaryRequire(String salaryRequire) {
		this.salaryRequire = salaryRequire;
	}

	public String getGraduateSchool() {
		return graduateSchool;
	}

	public void setGraduateSchool(String graduateSchool) {
		this.graduateSchool = graduateSchool;
	}

	public Integer getEducation() {
		return education;
	}

	public void setEducation(Integer education) {
		this.education = education;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Integer getJobState() {
		return jobState;
	}

	public void setJobState(Integer jobState) {
		this.jobState = jobState;
	}

	public Integer getFreshStudent() {
		return freshStudent;
	}

	public void setFreshStudent(Integer freshStudent) {
		this.freshStudent = freshStudent;
	}

	public Integer getWorkYear() {
		return workYear;
	}

	public void setWorkYear(Integer workYear) {
		this.workYear = workYear;
	}

	public String getPersonResume() {
		return personResume;
	}

	public void setPersonResume(String personResume) {
		this.personResume = personResume;
	}

	public String getPersonFile() {
		return personFile;
	}

	public void setPersonFile(String personFile) {
		this.personFile = personFile;
	}

	public Integer getRecommendState() {
		return recommendState;
	}

	public void setRecommendState(Integer recommendState) {
		this.recommendState = recommendState;
	}

	public String getRecommendTime() {
		return recommendTime;
	}

	public void setRecommendTime(String recommendTime) {
		this.recommendTime = recommendTime;
	}

	public String getRecommendIdea() {
		return recommendIdea;
	}

	public void setRecommendIdea(String recommendIdea) {
		this.recommendIdea = recommendIdea;
	}

	public String getInterviewResult() {
		return interviewResult;
	}

	public void setInterviewResult(String interviewResult) {
		this.interviewResult = interviewResult;
	}

	public String getInterviewTime() {
		return interviewTime;
	}

	public void setInterviewTime(String interviewTime) {
		this.interviewTime = interviewTime;
	}

	public String getResolutionTime() {
		return resolutionTime;
	}

	public void setResolutionTime(String resolutionTime) {
		this.resolutionTime = resolutionTime;
	}

}
