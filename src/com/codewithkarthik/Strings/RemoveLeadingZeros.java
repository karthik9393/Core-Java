package com.codewithkarthik.Strings;

public class RemoveLeadingZeros {

	public static void main(String[] args) {
		String str = "0000012450";
		System.out.println(removeZeros(str));
		

	}

	private static String removeZeros(String str) {
		int i =0 ;
		
		while(i<str.length()&& str.charAt(i)== '0')
			i++;
		
		StringBuffer sb = new StringBuffer(str);
		sb.replace(0, i, "");
		
		return sb.toString();
		
	}

}
