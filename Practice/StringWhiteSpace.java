package com.nmc.Practice;

public class StringWhiteSpace {
	
	public static boolean doesStringContainsOnlyWhiteSpace(String s){
		if(s.trim().isEmpty()) return true;
		else return false;
	}

	public static void main(String[] args) {
		
		String s1 = "Practice";
		String s2 = "        ";
		System.out.println(doesStringContainsOnlyWhiteSpace(s1));
		System.out.println(doesStringContainsOnlyWhiteSpace(s2));
	}

}
