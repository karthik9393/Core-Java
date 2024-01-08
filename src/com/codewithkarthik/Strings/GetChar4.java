package com.codewithkarthik.Strings;

public class GetChar4 {

	public static void main(String[] args) {
		String str = "Karthik";
		int index = 2;
		
		char charfromstr = getChar(str, index);
		System.out.println(charfromstr);

	}

	private static char getChar(String str, int index) {
		char[] charArray = new char[1];
		str.getChars(index, index+1, charArray, 0);
		return charArray[0];
	}

}
