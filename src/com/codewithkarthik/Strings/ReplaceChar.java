package com.codewithkarthik.Strings;

public class ReplaceChar {

	public static void main(String[] args) {
		String str = "Sharath Kothakonda";
		int index = 0;
		char ch = 'B';
		
		String replaceWithchar = replaceWithchar(str, index, ch);
		System.out.println(replaceWithchar);
	}

	private static String replaceWithchar(String str, int index, char ch) {
		
		str = ch + str.substring(index+1);
		
		return str;
		
		
	}

}
