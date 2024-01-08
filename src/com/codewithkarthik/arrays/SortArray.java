package com.codewithkarthik.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = {13,6,7,8,5,4,9,42,54,78};
		Integer[] arr1 = {44,6,7,8,5,4,9,42,54,78};
		//Arrays.sort(arr);
		//Arrays.sort(arr, 1, 6);
		
		Arrays.sort(arr1, Collections.reverseOrder());
		Arrays.sort(arr);
		
		reversArray(arr);
		for(int element: arr) {
			//cannot differenciate the numbers
			//78544213987654
			//System.out.print(element);
			
		}
		System.out.println();
		//[78, 54, 42, 13, 9, 8, 7, 6, 5, 4]
		//best way
		System.out.println(Arrays.toString(arr1));

	}

	private static void reversArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
		
	}

}
