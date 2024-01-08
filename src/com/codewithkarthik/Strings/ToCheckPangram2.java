package com.codewithkarthik.Strings;

public class ToCheckPangram2 {
	public static void main(String[] args) {
		
		String str = "Abcdefghijklmnopqrstuvwxyz";
		
		if(tochechPangram(str)) {
			System.out.println("Yes");
		}else
			System.out.println("no");
		
	}

	private static boolean tochechPangram(String str) {
		str = str.toLowerCase();
		boolean allLetterPresent = true;
		
		for(char ch = 'a'; ch<='z';  ch++) {
			if(!str.contains(String.valueOf(ch))) {
				allLetterPresent = false;
				return false;
				
			}
		}
		
		
		return true;
		
		
	}

}
