package com.xhhy.bean;

import java.io.Serializable;

public class ResumeBean implements Serializable {
	private Integer resumeId; // ����Id ����
	private Integer userId; // ְԱId ���
	private String name; // ְԱ����
	private Integer resumeSex; // ְԱ�Ա�
	private String resumeEmail; // ְԱemail
	private String resumePhone; // ְԱ�绰
	private String localAddress; // �������ڵ�
	private String homeAddress; // סַ
	private String political; // ������ò
	private String cardId; // ���������֤��
	private String salaryRequire; // н��Ҫ��
	private String graduateSchool; // ��ҵԺУ
	private Integer education; // ѧ��
	private String major; // רҵ
	private Integer jobState;// �Ƿ���ְ 0:��ְ�� 1:��ְ ��
	private Integer freshStudent; // �Ƿ�Ӧ���� 0:�ǣ� 1:��
	private Integer workYear; // ����ʱ��
	private String personResume; // ��������
	private String personFile; // ��ͥ��ϵ��Ϣ
	private Integer recommendState; // �Ƽ�״̬ 0:�Ƽ��� 1:���Ƽ�
	private String recommendTime; // �Ƽ�ʱ��
	private String recommendIdea; // �Ƽ����F
	private String interviewResult; // ¼�ý��
	private String interviewTime; // ����ʱ��
	private String resolutionTime; // ����ʱ��
	
	
	
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
