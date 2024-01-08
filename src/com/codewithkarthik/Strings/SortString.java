package com.codewithkarthik.Strings;
//sorting string like bubble sort based on unicode codes of characters.
public class SortString {

	public static void main(String[] args) {
		String str = "Hyderabad";
		System.out.println(sortString(str));

	}

	private static char[] sortString(String str) {
		char[] charArray = str.toCharArray();
		char temp =0;
		for(int i =0; i<str.length();i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(Character.toLowerCase(charArray[i])>Character.toLowerCase(charArray[j])) {
					temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
					
				}
			}
		}
		return charArray;
		
		
	}

}
