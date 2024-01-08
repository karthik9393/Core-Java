package com.codewithkarthik.coding;

public class PrimeNumbersOptimized {

	public static void main(String[] args) {
		int N =100;
		for(int i = 2; i<=N; i++) {
			if(isPrime(i)) {
				System.out.println(i + " ");
			}
		}

	}

	private static boolean isPrime(int n) {
		
		for(int i = 2; i*i<= n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
		
	}

}
