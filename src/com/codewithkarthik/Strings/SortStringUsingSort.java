package com.codewithkarthik.Strings;

import java.util.Arrays;

public class SortStringUsingSort {

	public static void main(String[] args) {
		String str =  "hyderabad";
		String outputString = sortString(str);
		System.out.println(outputString);

	}

	private static String sortString(String str) {
		
		char[] chararr = str.toCharArray();
		Arrays.sort(chararr);
		
		return new String(chararr);
		
		
	}

}
