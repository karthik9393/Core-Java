package com.codewithkarthik.Strings;

public class InsertString {

	public static void main(String[] args) {
		String str = "Karthik Sanga";
		String strTobeInserted = "Raj";
		int index = 7;
		String newString = str.substring(0, index+1)
				+strTobeInserted+ str.substring(index );
		
		System.out.println(newString);
		

	}
}


