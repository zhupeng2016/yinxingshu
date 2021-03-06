package com.xhhy.bean;
/**
                   人事档案管理
 */
 
import java.io.Serializable;

public class RecordBean implements Serializable{

	private int archiveId;//id
	private int archiveState;//档案状态
	private String archiveCode;//档案编号
	private int auditState;//审核状态
	private int archiveDel;//删除状态
	private String archiveTime;//建档时间
	private String familyInfor;//家庭关系信息
	private String bank;//开户行
	private String bankCard;//银行卡号
	private String socialCard;//社保卡号
	private String archiveName;//档案的人员名称
	private String archiveSex;//性别
	private String archiveDept;//部门名称
	private String archiveEmail;//邮箱
	private String archivePhone;//手机
	private String archiveAddress;//住址
	private String archiveCardId;//身份证号码
	private String archiveHomeAddress;//户口所在地
	private String archivePolitics;//政治面貌
	private String archiveGraduateSchool;//毕业院校
	private String archiveMajor;//专业
	private String archiveEducation;//学历
	private String archiveSalary;//薪酬标准
	private String archiveResume;//个人简历
	private String archiveDuty;//职位
	private String archiveDutyCode;//职位编码
	private String archiveTitle;//职称
	private String archiveRemark;//备注
	private String archiveLoginName;//登记人
	//模糊查询的两个字段
	private String startTime;//模糊查询开始时间
	private String endTime;//模糊查询结束时间
	//引入其它几个对象
	private DeptBean db;//
	private ResumeBean  rb;
	private UserBean  ub;//涉及到当前登陆人
	private SalaryBean  sb;//关联到薪酬标准
	//
	public int getArchiveId() {
		return archiveId;
	}
	public void setArchiveId(int archiveId) {
		this.archiveId = archiveId;
	}
	public int getArchiveState() {
		return archiveState;
	}
	public void setArchiveState(int archiveState) {
		this.archiveState = archiveState;
	}
	public String getArchiveCode() {
		return archiveCode;
	}
	public void setArchiveCode(String archiveCode) {
		this.archiveCode = archiveCode;
	}
	public int getAuditState() {
		return auditState;
	}
	public void setAuditState(int auditState) {
		this.auditState = auditState;
	}
	public int getArchiveDel() {
		return archiveDel;
	}
	public void setArchiveDel(int archiveDel) {
		this.archiveDel = archiveDel;
	}
	public String getArchiveTime() {
		return archiveTime;
	}
	public void setArchiveTime(String archiveTime) {
		this.archiveTime = archiveTime;
	}
	public String getFamilyInfor() {
		return familyInfor;
	}
	public void setFamilyInfor(String familyInfor) {
		this.familyInfor = familyInfor;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBankCard() {
		return bankCard;
	}
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
	public String getSocialCard() {
		return socialCard;
	}
	public void setSocialCard(String socialCard) {
		this.socialCard = socialCard;
	}
	public String getArchiveName() {
		return archiveName;
	}
	public void setArchiveName(String archiveName) {
		this.archiveName = archiveName;
	}
	public String getArchiveSex() {
		return archiveSex;
	}
	public void setArchiveSex(String archiveSex) {
		this.archiveSex = archiveSex;
	}
	public String getArchiveDept() {
		return archiveDept;
	}
	public void setArchiveDept(String archiveDept) {
		this.archiveDept = archiveDept;
	}
	public String getArchiveEmail() {
		return archiveEmail;
	}
	public void setArchiveEmail(String archiveEmail) {
		this.archiveEmail = archiveEmail;
	}
	public String getArchivePhone() {
		return archivePhone;
	}
	public void setArchivePhone(String archivePhone) {
		this.archivePhone = archivePhone;
	}
	public String getArchiveAddress() {
		return archiveAddress;
	}
	public void setArchiveAddress(String archiveAddress) {
		this.archiveAddress = archiveAddress;
	}
	public String getArchiveCardId() {
		return archiveCardId;
	}
	public void setArchiveCardId(String archiveCardId) {
		this.archiveCardId = archiveCardId;
	}
	public String getArchiveHomeAddress() {
		return archiveHomeAddress;
	}
	public void setArchiveHomeAddress(String archiveHomeAddress) {
		this.archiveHomeAddress = archiveHomeAddress;
	}
	public String getArchivePolitics() {
		return archivePolitics;
	}
	public void setArchivePolitics(String archivePolitics) {
		this.archivePolitics = archivePolitics;
	}
	public String getArchiveGraduateSchool() {
		return archiveGraduateSchool;
	}
	public void setArchiveGraduateSchool(String archiveGraduateSchool) {
		this.archiveGraduateSchool = archiveGraduateSchool;
	}
	public String getArchiveMajor() {
		return archiveMajor;
	}
	public void setArchiveMajor(String archiveMajor) {
		this.archiveMajor = archiveMajor;
	}
	public String getArchiveEducation() {
		return archiveEducation;
	}
	public void setArchiveEducation(String archiveEducation) {
		this.archiveEducation = archiveEducation;
	}
	public String getArchiveSalary() {
		return archiveSalary;
	}
	public void setArchiveSalary(String archiveSalary) {
		this.archiveSalary = archiveSalary;
	}
	public String getArchiveResume() {
		return archiveResume;
	}
	public void setArchiveResume(String archiveResume) {
		this.archiveResume = archiveResume;
	}
	public String getArchiveDuty() {
		return archiveDuty;
	}
	public void setArchiveDuty(String archiveDuty) {
		this.archiveDuty = archiveDuty;
	}
	public String getArchiveDutyCode() {
		return archiveDutyCode;
	}
	public void setArchiveDutyCode(String archiveDutyCode) {
		this.archiveDutyCode = archiveDutyCode;
	}
	public String getArchiveTitle() {
		return archiveTitle;
	}
	public void setArchiveTitle(String archiveTitle) {
		this.archiveTitle = archiveTitle;
	}
	public String getArchiveRemark() {
		return archiveRemark;
	}
	public void setArchiveRemark(String archiveRemark) {
		this.archiveRemark = archiveRemark;
	}
	public String getArchiveLoginName() {
		return archiveLoginName;
	}
	public void setArchiveLoginName(String archiveLoginName) {
		this.archiveLoginName = archiveLoginName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public DeptBean getDb() {
		return db;
	}
	public void setDb(DeptBean db) {
		this.db = db;
	}
	public ResumeBean getRb() {
		return rb;
	}
	public void setRb(ResumeBean rb) {
		this.rb = rb;
	}
	public UserBean getUb() {
		return ub;
	}
	public void setUb(UserBean ub) {
		this.ub = ub;
	}
	public SalaryBean getSb() {
		return sb;
	}
	public void setSb(SalaryBean sb) {
		this.sb = sb;
	}
	public RecordBean(int archiveId, int archiveState, String archiveCode, int auditState, int archiveDel,
			String archiveTime, String familyInfor, String bank, String bankCard, String socialCard, String archiveName,
			String archiveSex, String archiveDept, String archiveEmail, String archivePhone, String archiveAddress,
			String archiveCardId, String archiveHomeAddress, String archivePolitics, String archiveGraduateSchool,
			String archiveMajor, String archiveEducation, String archiveSalary, String archiveResume,
			String archiveDuty, String archiveDutyCode, String archiveTitle, String archiveRemark,
			String archiveLoginName, String startTime, String endTime, DeptBean db, ResumeBean rb, UserBean ub,
			SalaryBean sb) {
		super();
		this.archiveId = archiveId;
		this.archiveState = archiveState;
		this.archiveCode = archiveCode;
		this.auditState = auditState;
		this.archiveDel = archiveDel;
		this.archiveTime = archiveTime;
		this.familyInfor = familyInfor;
		this.bank = bank;
		this.bankCard = bankCard;
		this.socialCard = socialCard;
		this.archiveName = archiveName;
		this.archiveSex = archiveSex;
		this.archiveDept = archiveDept;
		this.archiveEmail = archiveEmail;
		this.archivePhone = archivePhone;
		this.archiveAddress = archiveAddress;
		this.archiveCardId = archiveCardId;
		this.archiveHomeAddress = archiveHomeAddress;
		this.archivePolitics = archivePolitics;
		this.archiveGraduateSchool = archiveGraduateSchool;
		this.archiveMajor = archiveMajor;
		this.archiveEducation = archiveEducation;
		this.archiveSalary = archiveSalary;
		this.archiveResume = archiveResume;
		this.archiveDuty = archiveDuty;
		this.archiveDutyCode = archiveDutyCode;
		this.archiveTitle = archiveTitle;
		this.archiveRemark = archiveRemark;
		this.archiveLoginName = archiveLoginName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.db = db;
		this.rb = rb;
		this.ub = ub;
		this.sb = sb;
	}
	public RecordBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
