package com.codewithkarthik.Strings;
//swapping pairs of characters 
public class SwappingPairs {

	public static void main(String[] args) {
		String str = "France";
		String outPut = swapPairs(str);
		System.out.println(outPut);

	}

	private static String swapPairs(String str) {
		
		if(str == null || str.isEmpty()) {
			return str;
		}
		
		char[] charArray = str.toCharArray();
		for(int i =0; i<str.length(); i+=2) {
			char temp = charArray[i];
			charArray[i] = charArray[i+1];
			charArray[i+1] = temp;
		}
		return new String(charArray);
		
		
	}

}
