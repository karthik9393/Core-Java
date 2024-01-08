package com.codewithkarthik.coding;

public class FactorialOfN {

	public static void main(String[] args) {
		int N = 5;
		System.out.println(factorialOfN(N));

	}

	private static int factorialOfN(int n) {
		int factorial = 1;
		for( int i = 1; i<= n ; i++) {
			factorial = factorial * i;
			
		}
		return factorial;
		
	}

}
