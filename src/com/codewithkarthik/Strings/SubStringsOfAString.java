package com.codewithkarthik.Strings;

import java.util.ArrayList;


public class SubStringsOfAString {

	public static void main(String[] args) {
		String str = "The Cat";
		int count = 1;
		ArrayList<String> splitStrings = splitStrings(str);
		for(String subString: splitStrings) {
			System.out.println(" "+count+" : \""+ subString+"\"");
			count++;
		}

	}

	private static ArrayList<String> splitStrings(String str) {
		
		ArrayList<String> strings = new ArrayList<>();
		
		for(int i =0; i<str.length(); i++) {
			for(int j = i +1; j<str.length(); j++) {
				strings.add(str.substring(i, j));
			}
		}
		return strings;
		
		
	}

}
