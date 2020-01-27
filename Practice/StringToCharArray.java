package com.nmc.Practice;

public class StringToCharArray {

	public static void main(String[] args) {
		
		String s = "GeeksForGeeks";
		char[] ch = new char[s.length()];
		char[] opposite = new char[s.length()];
		
		/*for(int i=0;i<s.length();i++){
			ch[i] = s.charAt(i);
		}*/
		//To convert a string to charArray we can use char[] c = string.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--){
			opposite[i] = s.charAt(i);
		}
		
		/*for(char c:ch){
			System.out.println(c);
		}*/
		
		for(char c:opposite){
			System.out.println(c);
		}

	}

}
