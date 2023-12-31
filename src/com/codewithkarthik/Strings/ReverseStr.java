package com.codewithkarthik.Strings;

public class ReverseStr {

	public static void main(String[] args) {
		String str = "Alpha";
		String rev = "";
		char ch;
		String reverse = reverseStr(str, rev);
		System.out.println(reverse);
		
	}

	private static String reverseStr(String str, String rev) {
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			rev = ch + rev;
		}
		return rev;
		
		
	}

}
