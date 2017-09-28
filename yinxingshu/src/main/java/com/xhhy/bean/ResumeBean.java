package com.xhhy.bean;

import java.io.Serializable;

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
	private String attributeMianshi;//是否面试过
	
	
	
	
	public String getAttributeMianshi() {
		return attributeMianshi;
	}
	public void setAttributeMianshi(String attributeMianshi) {
		this.attributeMianshi = attributeMianshi;
	}
	public ResumeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResumeBean(Integer resumeId, Integer userId, String name, Integer resumeSex, String resumeEmail,
			String resumePhone, String localAddress, String homeAddress, String political, String cardId,
			String salaryRequire, String graduateSchool, Integer education, String major, Integer jobState,
			Integer freshStudent, Integer workYear, String personResume, String personFile, Integer recommendState,
			String recommendTime, String recommendIdea, String interviewResult, String interviewTime,
			String resolutionTime) {
		super();
		this.resumeId = resumeId;
		this.userId = userId;
		this.name = name;
		this.resumeSex = resumeSex;
		this.resumeEmail = resumeEmail;
		this.resumePhone = resumePhone;
		this.localAddress = localAddress;
		this.homeAddress = homeAddress;
		this.political = political;
		this.cardId = cardId;
		this.salaryRequire = salaryRequire;
		this.graduateSchool = graduateSchool;
		this.education = education;
		this.major = major;
		this.jobState = jobState;
		this.freshStudent = freshStudent;
		this.workYear = workYear;
		this.personResume = personResume;
		this.personFile = personFile;
		this.recommendState = recommendState;
		this.recommendTime = recommendTime;
		this.recommendIdea = recommendIdea;
		this.interviewResult = interviewResult;
		this.interviewTime = interviewTime;
		this.resolutionTime = resolutionTime;
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
	@Override
	public String toString() {
		return "ResumeBean [resumeId=" + resumeId + ", userId=" + userId + ", name=" + name + ", resumeSex=" + resumeSex
				+ ", resumeEmail=" + resumeEmail + ", resumePhone=" + resumePhone + ", localAddress=" + localAddress
				+ ", homeAddress=" + homeAddress + ", political=" + political + ", cardId=" + cardId
				+ ", salaryRequire=" + salaryRequire + ", graduateSchool=" + graduateSchool + ", education=" + education
				+ ", major=" + major + ", jobState=" + jobState + ", freshStudent=" + freshStudent + ", workYear="
				+ workYear + ", personResume=" + personResume + ", personFile=" + personFile + ", recommendState="
				+ recommendState + ", recommendTime=" + recommendTime + ", recommendIdea=" + recommendIdea
				+ ", interviewResult=" + interviewResult + ", interviewTime=" + interviewTime + ", resolutionTime="
				+ resolutionTime + "]";
	}

	

}
