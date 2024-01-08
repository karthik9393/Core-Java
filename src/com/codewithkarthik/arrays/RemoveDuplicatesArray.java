package com.codewithkarthik.arrays;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,4,5,5,7,89,89,567};
		int n = arr.length;
		
		n = removeDuplicates(arr,n );
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

	private static int removeDuplicates(int[] arr, int n) {
		int[] temp= new int[n];
		int j = 0;
		for(int i=0; i < n-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		
		temp[j++] = arr[n-1];
		
		for(int i = 0; i<j;i++) {
			arr[i] = temp[i];
		}
		
		return j;
		
		
		
	}

}
