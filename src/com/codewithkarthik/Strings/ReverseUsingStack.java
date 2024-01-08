package com.codewithkarthik.Strings;

import java.util.Stack;

public class ReverseUsingStack {

	public static void main(String[] args) {
		String str = "Hyderabad";
		String reverse = reverseString(str);
		System.out.println(reverse);

	}

	private static String reverseString(String str) {
		char[] reverse = new char[str.length()];
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			stack.push(str.charAt(i));
			
		}
		int i=0;
		while(!stack.isEmpty()) {
			reverse[i++]= stack.pop();
		}
		return new String(reverse);
	
		
	}

}
