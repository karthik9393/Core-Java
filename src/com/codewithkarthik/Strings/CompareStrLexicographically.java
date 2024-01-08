package com.codewithkarthik.Strings;

//The method compareTo() is used for comparing two strings lexicographically
//Each character of both the strings is converted into a Unicode value for comparison

public class CompareStrLexicographically {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Ram";
		String s3 = "Anshul";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));

	}

}
