package com.nmc.Practice;

public class IfStringIsNull {
	
	public static boolean isNull(String s){
		
		if(s == null) return true;
		
		else return false;
	}
	
	public static boolean isEmptyCheck(String s){
		if(s.isEmpty())return true;
		else return false;
	}

	public static void main(String[] args) {
		String s1 = null;
		String s2 = "correct";
		/*System.out.println(isNull(s1));
		System.out.println(isNull(s2));*/
		
		String s3 = "";
		String s4 = "NotEmpty";
		
		System.out.println(isEmptyCheck(s3));
		System.out.println(isEmptyCheck(s4));

	}

}
