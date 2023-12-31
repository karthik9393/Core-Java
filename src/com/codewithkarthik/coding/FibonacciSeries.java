package com.codewithkarthik.coding;

//Java Program to Find Sum of Fibonacci Series Numbers
//of First N Even Indexes
public class FibonacciSeries {

	public static void main(String[] args) {
		int N = 11;
		System.out.println(fibSumOfEven(N));

	}

	private static int fibSumOfEven(int n) {
		int[] fibonocci = new int[2*n+1];
		
		fibonocci[0]=0;
		fibonocci[1]= 1;
		int sum = 0;
		for(int i=2; i<fibonocci.length; i++) {
			fibonocci[i]=fibonocci[i-1]+fibonocci[i-2];
			
			if(i%2==0) {
				sum = sum + fibonocci[i];
			}
			
		}
		
		return sum;
		
		
	}

}
