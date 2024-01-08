package com.codewithkarthik.Strings;

public class ToCheckPangram {

	public static void main(String[] args) {
		String str = "Abcdefghijklmnopqrstuvwxya";
		if(allLetter(str))
			System.out.println("Yes, it is a pangram");
		else
			System.out.println("No");
			

	}

	private static boolean allLetter(String str) {
		int size = 26;
		str = str.toLowerCase();
		boolean[] present = new boolean[size];
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				int letter = str.charAt(i)-'a';
				present[letter]= true;
			}
		}
		
		for(int i =0; i<size; i++) {
			if(!present[i])
				return false;
		}
		
		return true;
		
		
	}

}
