package com.codewithkarthik.Strings;

public class GetChar2 {

	public static void main(String[] args) {
		String str = "Hyderabad";
		int index = 2;
		char getchar = getChar(str, index);
		System.out.println("the char at "+ index+ " is "+ getchar);

	}

	private static char getChar(String str, int index) {
		
		return str.toCharArray()[index];
		
	}

}
