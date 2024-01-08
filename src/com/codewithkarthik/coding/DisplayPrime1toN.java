package com.codewithkarthik.coding;

import java.util.ArrayList;

public class DisplayPrime1toN {

	public static void main(String[] args) {
		int N = 11;
		ArrayList<Integer> displayPrimetillN = displayPrimetillN(N);
		for(int prime: displayPrimetillN) {
			System.out.println(prime+" ");
		}
	}

	private static ArrayList<Integer> displayPrimetillN(int n) {
		ArrayList<Integer> primeList = new ArrayList<>();
		for(int i = 2; i <= n; i++) {
			boolean isPrime = true;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				int factorCount = 0;
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				primeList.add(i);
			}
		}
		return primeList;
		
	}

}
