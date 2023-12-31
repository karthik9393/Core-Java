package com.codewithkarthik.Strings;

public class CheckUnicodePoint {

	public static void main(String[] args) {
		String str = "Karthik";
		checkUnicodeAtIndex(str);

	}

	private static void checkUnicodeAtIndex(String str) {
		char[] charArray = str.toCharArray();
		
		for(int i =0; i<str.length();i++) {
			int unicode = str.codePointAt(i);
			System.out.println("The Unicode for char "+charArray[i]+ " at index - "+i+ 
					" is "+ unicode);
		}
		
	}

}
