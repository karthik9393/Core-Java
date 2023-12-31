package com.codewithkarthik.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintFirstLetterRegex {

	public static void main(String[] args) {
		String s1 = "Computer Science";
		String s2 = "Wireless Sensor networks";
		//to print the first letters of string
		Pattern p = Pattern.compile("\\b[a-zA-Z]");
		Matcher m1 = p.matcher(s1);
		
		Matcher m2 = p.matcher(s2);
		
		while(m1.find()) {
			System.out.print(m1.group());
		}
		System.out.println();
		while(m2.find())
			System.out.print(m2.group());
		
		

	}

}
