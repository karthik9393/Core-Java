package com.codewithkarthik.coding;

import java.util.Arrays;

//3 standard approaches to swap numbers varying from space
//and time complexity.

//1. Creating an auxiliary memory cell in the memory.
//2. Without creating any auxiliary(additional) memory cell
//3. Using exclusive OR (Bitwise XOR) operator
public class SwapTwoNums {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 34;
		//usingThirdVariable(num1, num2);
//		int[] result = withOutThirdVariable(num1, num2);
//		System.out.println(Arrays.toString(result));
		
		usingXOROperator(num1, num2);
	}

	private static void usingXOROperator(int num1, int num2) {
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println(num1);
		System.out.println(num2);
		
	}

	private static int[] withOutThirdVariable(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		return new int[] {num1, num2};
		
	}

	private static void usingThirdVariable(int num1, int num2) {
		
		
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
