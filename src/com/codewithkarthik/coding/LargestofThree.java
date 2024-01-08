package com.codewithkarthik.coding;

public class LargestofThree {

	public static void main(String[] args) {
		int a = 43;
		int b = 200;
		int c =44;
		
		System.out.println(usingTernary(a,b,c));

	}

	private static int usingTernary(int a, int b, int c) {
		
		int largest = a>(b>c?b:c)?a:(b>c?b:c);
		
		return largest;
		
		
	}

}
