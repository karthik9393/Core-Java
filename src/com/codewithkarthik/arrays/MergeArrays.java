package com.codewithkarthik.arrays;

import java.util.Arrays;

public class MergeArrays {
	public static void main(String[] args) {
		int[] a = {5,1,745,4};
		int[] b = {8,79,6,89,66};
		
		int a1 = a.length;
		int b1 = b.length;
		
		int c1 = a1 + b1;
		
		int[] c = new int[c1];
		
		for(int i =0; i<a1; i++) {
			c[i]= a[i];
			
		}
		for(int i=0; i<b1; i++) {
			c[a1+i]= b[i];
			
		}
		
		for(int i=0;i<c1; i++) {
			System.out.println(c[i]+ " ");
		}
		System.out.println(Arrays.toString(c));
	}

}
