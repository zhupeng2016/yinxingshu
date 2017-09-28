package com.xhhy.bean;

import java.io.Serializable;

public class RoleBean implements Serializable {

	private Integer roleId;// ְλid
	private Integer deptId;// ����id
	private String roleCode;// ְλ���
	private String roleName;// ְλ���
	private Integer roleKind;// ְλ����
	private Integer roleNum;// ��Ƹ�˔�
	private String startTime;// �Ǽ�ʱ��
	private String eddTime;// ��ֹʱ��
	private String roleIntro;// ְλ�����е�ְλ����
	private String roleRemark;// ְλ����
	private String roleRequired;// λҪ��
	private Integer roleState;// ְλ״̬
	private Integer roleDel;// ְλ��ɾ��״̬

	public RoleBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public RoleBean(Integer roleId, Integer deptId, String roleCode, String roleName, Integer roleKind, Integer roleNum,
			String startTime, String eddTime, String roleIntro, String roleRemark, String roleRequired,
			Integer roleState, Integer roleDel) {
		super();
		this.roleId = roleId;
		this.deptId = deptId;
		this.roleCode = roleCode;
		this.roleName = roleName;
		this.roleKind = roleKind;
		this.roleNum = roleNum;
		this.startTime = startTime;
		this.eddTime = eddTime;
		this.roleIntro = roleIntro;
		this.roleRemark = roleRemark;
		this.roleRequired = roleRequired;
		this.roleState = roleState;
		this.roleDel = roleDel;
	}



	public String getRoleRequired() {
		return roleRequired;
	}

	public void setRoleRequired(String roleRequired) {
		this.roleRequired = roleRequired;
	}

	public Integer getRoleNum() {
		return roleNum;
	}

	public void setRoleNum(Integer roleNum) {
		this.roleNum = roleNum;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	

	public Integer getRoleKind() {
		return roleKind;
	}

	public void setRoleKind(Integer roleKind) {
		this.roleKind = roleKind;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEddTime() {
		return eddTime;
	}

	public void setEddTime(String eddTime) {
		this.eddTime = eddTime;
	}

	public String getRoleIntro() {
		return roleIntro;
	}

	public void setRoleIntro(String roleIntro) {
		this.roleIntro = roleIntro;
	}

	public String getRoleRemark() {
		return roleRemark;
	}

	public void setRoleRemark(String roleRemark) {
		this.roleRemark = roleRemark;
	}

	public Integer getRoleState() {
		return roleState;
	}

	public void setRoleState(Integer roleState) {
		this.roleState = roleState;
	}

	public Integer getRoleDel() {
		return roleDel;
	}

	public void setRoleDel(Integer roleDel) {
		this.roleDel = roleDel;
	}



	@Override
	public String toString() {
		return "RoleBean [roleId=" + roleId + ", deptId=" + deptId + ", roleCode=" + roleCode + ", roleName=" + roleName
				+ ", roleKind=" + roleKind + ", roleNum=" + roleNum + ", startTime=" + startTime + ", eddTime="
				+ eddTime + ", roleIntro=" + roleIntro + ", roleRemark=" + roleRemark + ", roleRequired=" + roleRequired
				+ ", roleState=" + roleState + ", roleDel=" + roleDel + "]";
	}

	

}
