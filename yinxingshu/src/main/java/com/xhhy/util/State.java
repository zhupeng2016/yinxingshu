package com.xhhy.util;

public class State {
	
	public static final int UNDELET=0;
	public static final int DELET=1;
	
	public static final int PAGESIZE=3;
	public static final int NUM=3;
	
	
	public static final  boolean NOTNULL(String str){
		if(str != null && !"".equals(str)){
			return true;
		}
		return false;
	}

}
