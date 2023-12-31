package com.codewithkarthik.Strings;
//.charAt
public class GetChar {

	public static void main(String[] args) {
		
		String str = "Rajesh";
		int index = 4;
		char charFromString = getCharFromString(str, index);
		
		System.out.println("char from string str: "+ str+ " at index :"+index+ " is "+ charFromString);
		
		

	}

	private static char getCharFromString(String str, int index) {
		char charofStr = str.charAt(index);
		return charofStr;
		
	}

}
