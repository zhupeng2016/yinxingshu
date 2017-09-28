package com.xhhy.bean;

import java.io.Serializable;

public class SalaryBean implements Serializable {
	  private int salaryId; 
	  private String salaryCode;//薪酬编码
	  private String salaryName;//薪酬名称
	  private String salaryMaker;//制定人
	  private String salaryRegister;//登记人
	  private String registerTime;//登记时间
	  private String basePay;//基本工资
	  private String addPay;//绩效奖金
	  private String trafficPay;//交通补助
	  private String phonePay;//电话补助
	  private String foodPay;//餐补
	  private String housePay;//住房补助
	  private String awayPay;//出差补助
	  private String overtimePay;//加班补助
	  private String salaryRemark;//备注
	  private int salaryState;//审批状态
      private int salaryDel;//删除状态
      private String allSalary;//工资总额
      private String salary3;
      private String salary4;
      
      
	public SalaryBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getSalaryId() {
		return salaryId;
	}


	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}


	public String getSalaryCode() {
		return salaryCode;
	}


	public void setSalaryCode(String salaryCode) {
		this.salaryCode = salaryCode;
	}


	public String getSalaryName() {
		return salaryName;
	}


	public void setSalaryName(String salaryName) {
		this.salaryName = salaryName;
	}


	public String getSalaryMaker() {
		return salaryMaker;
	}


	public void setSalaryMaker(String salaryMaker) {
		this.salaryMaker = salaryMaker;
	}


	public String getSalaryRegister() {
		return salaryRegister;
	}


	public void setSalaryRegister(String salaryRegister) {
		this.salaryRegister = salaryRegister;
	}


	public String getRegisterTime() {
		return registerTime;
	}


	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}


	public String getBasePay() {
		return basePay;
	}


	public void setBasePay(String basePay) {
		this.basePay = basePay;
	}


	public String getAddPay() {
		return addPay;
	}


	public void setAddPay(String addPay) {
		this.addPay = addPay;
	}


	public String getTrafficPay() {
		return trafficPay;
	}


	public void setTrafficPay(String trafficPay) {
		this.trafficPay = trafficPay;
	}


	public String getPhonePay() {
		return phonePay;
	}


	public void setPhonePay(String phonePay) {
		this.phonePay = phonePay;
	}


	public String getFoodPay() {
		return foodPay;
	}


	public void setFoodPay(String foodPay) {
		this.foodPay = foodPay;
	}


	public String getHousePay() {
		return housePay;
	}


	public void setHousePay(String housePay) {
		this.housePay = housePay;
	}


	public String getAwayPay() {
		return awayPay;
	}


	public void setAwayPay(String awayPay) {
		this.awayPay = awayPay;
	}


	public String getOvertimePay() {
		return overtimePay;
	}


	public void setOvertimePay(String overtimePay) {
		this.overtimePay = overtimePay;
	}


	public String getSalaryRemark() {
		return salaryRemark;
	}


	public void setSalaryRemark(String salaryRemark) {
		this.salaryRemark = salaryRemark;
	}



	

	public int getSalaryState() {
		return salaryState;
	}



	public void setSalaryState(int salaryState) {
		this.salaryState = salaryState;
	}



	public int getSalaryDel() {
		return salaryDel;
	}



	public void setSalaryDel(int salaryDel) {
		this.salaryDel = salaryDel;
	}



	public String getAllSalary() {
		return allSalary;
	}


	public void setAllSalary(String allSalary) {
		this.allSalary = allSalary;
	}


	public String getSalary3() {
		return salary3;
	}


	public void setSalary3(String salary3) {
		this.salary3 = salary3;
	}


	public String getSalary4() {
		return salary4;
	}


	public void setSalary4(String salary4) {
		this.salary4 = salary4;
	}
      
      
      
}
