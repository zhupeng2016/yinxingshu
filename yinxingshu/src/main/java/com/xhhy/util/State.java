package com.xhhy.util;

public class State {
	
	public static final int UNDELET=0;
	public static final int DELET=1;
	
	public static final int PAGESIZE=8;
	public static final int NUM=3;
	
	
	public static final  boolean NOTNULL(String str){
		if(str != null && !"".equals(str)){
			return true;
		}
		return false;
	}

	public static final int DEL =0;//已删除
	public static final int UNDEL = 1;//未删除
	

	
	public static final int SALARY_QICAO=0;//起草
	public static final int SALARY_SHENHEZHONG=1;//审核中
	public static final int SALARY_SHENHETONGGUO=2;//审核通过
	public static final int SALARY_BOHUI=3;//驳回
}
