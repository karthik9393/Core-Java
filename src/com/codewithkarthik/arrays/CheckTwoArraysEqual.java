package com.codewithkarthik.arrays;

public class CheckTwoArraysEqual {

	public static void main(String[] args) {
		int[] a = {20,56};
		int[] b = {20,56,1};
		boolean result = true;
		if(a.length == b.length) {
			for(int i =0; i<a.length; i++) {
				if(a[i] != b[i]) {
					result = false;
				}
			}
		}else {
			result = false;
		}
		System.out.println("Are arrays equal ? "+ result);
		

	}

}
