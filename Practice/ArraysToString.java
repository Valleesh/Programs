package com.nmc.Practice;

import java.util.Arrays;

public class ArraysToString {

	public static void main(String[] args) {
	boolean[] boolArr 
        = new boolean[] { true, true, false, true }; 
    char[] charArr 
        = new char[] { 'g', 'e', 'e', 'k', 's' }; 
    double[] dblArr 
        = new double[] { 1, 2, 3, 4 }; 
    int[] intArr 
        = new int[] { 1, 2, 3, 4 }; 
    Object[] objArr 
        = new Object[] { 1, 2, 3, 4 }; 
    
    System.out.println(Arrays.toString(boolArr));
    System.out.println(Arrays.toString(charArr));
    System.out.println(Arrays.toString(dblArr));
    System.out.println(Arrays.toString(intArr));
    System.out.println(Arrays.toString(objArr));

	}

}
