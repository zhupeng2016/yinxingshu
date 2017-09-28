package com.xhhy.bean;
/**
                   人事档案管理
 */
 
import java.io.Serializable;

public class RecordBean implements Serializable{

	private int archiveId;//id
	private int archiveState;//档案状态
	private int archiveCode;//档案编号
	private int auditState;//审核状态
	private String archiveTime;//建档时间
	private String familyInfo;//家庭关系信息
	private String bank;//开户行
	private String bankCard;//银行卡号
	private String socialCard;//社保卡号
	//引入其它几个对象
	private DeptBean db;
	private ResumeBean  rb;
	private UserBean  ub;
	private SalaryBean  sb;
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
	public int getArchiveCode() {
		return archiveCode;
	}
	public void setArchiveCode(int archiveCode) {
		this.archiveCode = archiveCode;
	}
	public int getAuditState() {
		return auditState;
	}
	public void setAuditState(int auditState) {
		this.auditState = auditState;
	}
	public String getArchiveTime() {
		return archiveTime;
	}
	public void setArchiveTime(String archiveTime) {
		this.archiveTime = archiveTime;
	}
	public String getFamilyInfo() {
		return familyInfo;
	}
	public void setFamilyInfo(String familyInfo) {
		this.familyInfo = familyInfo;
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
	public RecordBean(int archiveId, int archiveState, int archiveCode, int auditState, String archiveTime,
			String familyInfo, String bank, String bankCard, String socialCard, DeptBean db, ResumeBean rb, UserBean ub,
			SalaryBean sb) {
		super();
		this.archiveId = archiveId;
		this.archiveState = archiveState;
		this.archiveCode = archiveCode;
		this.auditState = auditState;
		this.archiveTime = archiveTime;
		this.familyInfo = familyInfo;
		this.bank = bank;
		this.bankCard = bankCard;
		this.socialCard = socialCard;
		this.db = db;
		this.rb = rb;
		this.ub = ub;
		this.sb = sb;
	}
	public RecordBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RecordBean [archiveId=" + archiveId + ", archiveState=" + archiveState + ", archiveCode=" + archiveCode
				+ ", auditState=" + auditState + ", archiveTime=" + archiveTime + ", familyInfo=" + familyInfo
				+ ", bank=" + bank + ", bankCard=" + bankCard + ", socialCard=" + socialCard + ", db=" + db + ", rb="
				+ rb + ", ub=" + ub + ", sb=" + sb + "]";
	}
	
	
	 
	
}
