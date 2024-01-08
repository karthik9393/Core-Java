package com.codewithkarthik.Strings;

public class SwapPairsUsingStBuffer {

	public static void main(String[] args) {
		String str = "California";
		System.out.println(swapPairs(str));

	}

	private static String swapPairs(String str) {
		
		StringBuffer sb = new StringBuffer(str.length());
		for(int i =0; i<str.length()-1; i+=2) {
			sb.append(str.charAt(i+1));
			sb.append(str.charAt(i));
			
		}
		
		if(!((str.length()%2) == 0)) {
			sb.append(str.charAt(str.length()-1));
		}
		return sb.toString();
		
	}

}
