package com.xhhy.bean;

import java.io.Serializable;

public class TarBean implements Serializable {
		private int tarId;//培训编号
		private String tarName;//培训名称
		private String tarTeacher;//培训教师
		private String tarStartTime;//培训开始时间
		private String tarEddTime;//培训结束时间
		private String tarRequired;//
		private String tarIntro;//培训简介
		private String tarResouce;//
		private int tarState;//培训状态
		private String tarOpinion;//培训意见
		private int tarResult;//培训结果状态
		private String tarSummary;//培训总结
		private String evalutionResult;//培训结果
		public TarBean() {
			super();
			// TODO Auto-generated constructor stub
		}
		public TarBean(int tarId, String tarName, String tarTeacher, String tarStartTime, String tarEddTime,
				String tarRequired, String tarIntro, String tarResouce, int tarState, String tarOpinion, int tarResult,
				String tarSummary, String evalutionResult) {
			super();
			this.tarId = tarId;
			this.tarName = tarName;
			this.tarTeacher = tarTeacher;
			this.tarStartTime = tarStartTime;
			this.tarEddTime = tarEddTime;
			this.tarRequired = tarRequired;
			this.tarIntro = tarIntro;
			this.tarResouce = tarResouce;
			this.tarState = tarState;
			this.tarOpinion = tarOpinion;
			this.tarResult = tarResult;
			this.tarSummary = tarSummary;
			this.evalutionResult = evalutionResult;
		}
		public int getTarId() {
			return tarId;
		}
		public void setTarId(int tarId) {
			this.tarId = tarId;
		}
		public String getTarName() {
			return tarName;
		}
		public void setTarName(String tarName) {
			this.tarName = tarName;
		}
		public String getTarTeacher() {
			return tarTeacher;
		}
		public void setTarTeacher(String tarTeacher) {
			this.tarTeacher = tarTeacher;
		}
		public String getTarStartTime() {
			return tarStartTime;
		}
		public void setTarStartTime(String tarStartTime) {
			this.tarStartTime = tarStartTime;
		}
		public String getTarEddTime() {
			return tarEddTime;
		}
		public void setTarEddTime(String tarEddTime) {
			this.tarEddTime = tarEddTime;
		}
		public String getTarRequired() {
			return tarRequired;
		}
		public void setTarRequired(String tarRequired) {
			this.tarRequired = tarRequired;
		}
		public String getTarIntro() {
			return tarIntro;
		}
		public void setTarIntro(String tarIntro) {
			this.tarIntro = tarIntro;
		}
		public String getTarResouce() {
			return tarResouce;
		}
		public void setTarResouce(String tarResouce) {
			this.tarResouce = tarResouce;
		}
		public int getTarState() {
			return tarState;
		}
		public void setTarState(int tarState) {
			this.tarState = tarState;
		}
		public String getTarOpinion() {
			return tarOpinion;
		}
		public void setTarOpinion(String tarOpinion) {
			this.tarOpinion = tarOpinion;
		}
		public int getTarResult() {
			return tarResult;
		}
		public void setTarResult(int tarResult) {
			this.tarResult = tarResult;
		}
		public String getTarSummary() {
			return tarSummary;
		}
		public void setTarSummary(String tarSummary) {
			this.tarSummary = tarSummary;
		}
		public String getEvalutionResult() {
			return evalutionResult;
		}
		public void setEvalutionResult(String evalutionResult) {
			this.evalutionResult = evalutionResult;
		}
		
}
