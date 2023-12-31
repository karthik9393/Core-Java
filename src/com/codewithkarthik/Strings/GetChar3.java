package com.codewithkarthik.Strings;

public class GetChar3 {

	public static void main(String[] args) {
		String str = "Karthik";
		int index = 2;
		
		char charfromstr = getChar(str, index);
		System.out.println(charfromstr);

	}

	private static char getChar(String str, int index) {
		
		return (char)str.codePointAt(index);
		
		
	}

}
