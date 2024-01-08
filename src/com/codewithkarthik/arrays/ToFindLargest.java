package com.codewithkarthik.arrays;

public class ToFindLargest {

	public static void main(String[] args) {
		int arr[] = {78,56,489,5623,89};
		int max = largest(arr);
		System.out.println("the largest num is: "+ max);

	}

	private static int largest(int arr[]) {
		int max = arr[0];
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
			
		}
		return max;
	}

}
