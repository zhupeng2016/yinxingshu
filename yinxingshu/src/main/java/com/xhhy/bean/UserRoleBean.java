package com.xhhy.bean;

import java.io.Serializable;

public class UserRoleBean implements Serializable {
	
	private int userId;
	private int roleId;
	private RoleBean rb;
	
	public UserRoleBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRoleBean(int userId, int roleId, RoleBean rb) {
		super();
		this.userId = userId;
		this.roleId = roleId;
		this.rb = rb;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public RoleBean getRb() {
		return rb;
	}

	public void setRb(RoleBean rb) {
		this.rb = rb;
	}
	
	

}
