package com.codewithkarthik.search;

import java.util.Arrays;

public class BinarySearchIterative {
	//applys on sorted array.

	public static void main(String[] args) {
		int arr[] = {2,56,88,99};
		
		//System.out.println();
		int target = 2;
		
		int index = binarySearchIterative(arr,target);
		if(index == -1) {
			System.out.println("element not found!");
		}else {
			System.out.println("element found at: "+ index);
		}

	}

	private static int binarySearchIterative(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		
		while(start<=end) {
			int mid = (start + end)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] < target){
				start = mid+1;
			}else{
				end = mid-1;
			}
		}
		return -1;
		
	}

}
