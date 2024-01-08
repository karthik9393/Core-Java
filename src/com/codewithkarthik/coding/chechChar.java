package com.codewithkarthik.coding;

public class chechChar {

	public static void main(String[] args) {
		System.out.println(isVowel('a'));
		

	}

	private static String isVowel(char ch) {
		String str = "aeiouAEIOU";
		return (str.indexOf(ch)!=-1)? "vowel":"Constant";
		
		
		
	}

}
