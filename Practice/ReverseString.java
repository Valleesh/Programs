package com.nmc.Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ReverseString {

	public static void main(String[] args) {
		//method1 :By using reverse() of stringBuilder
		
		String s = "GeeksForGeeks";
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb);
		
		//method2 :COnverting string to charArray
		
		String input = "GeeksForGeeks";
		char[] ch = input.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		System.out.println();
		
		//method3:Using Collections i.e.,ListIterator
		String input1 = "GeeksForGeeks";
		char[] ch1 = input1.toCharArray();
		List<Character> li= new ArrayList<Character>();
		
		for(char c:ch1){
			li.add(c);
		}
		Collections.reverse(li);
		ListIterator l = li.listIterator();
		while(l.hasNext()){
			System.out.print(l.next());
		}

	}

}
