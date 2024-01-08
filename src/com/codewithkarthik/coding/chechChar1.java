package com.codewithkarthik.coding;

public class chechChar1 {

	public static void main(String[] args) {
		vowelOrConstant('y');

	}

	private static void vowelOrConstant(char c) {
		if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u') {
			System.out.println("vowel");
			
		}else {
			System.out.println("constant");
		}
		
	}

}
