package com.codewithkarthik.Strings;

public class ReplaceChar2 {

	public static void main(String[] args) {
		String str = "Sharath Kothakonda";
		int index = 0;
		char ch = 'B';
		
		replaceWithchar(str, index, ch);
		

	}

	private static void replaceWithchar(String str, int index, char ch) {
		StringBuilder string = new StringBuilder(str);
		string.setCharAt(index, ch);
		System.out.println(string);
	}

}
