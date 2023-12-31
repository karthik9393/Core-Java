package com.codewithkarthik.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesSET {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,4,5,5,7,89,89,567};
		int n = arr.length;
		
		n = removeDuplicates(arr, n);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

	private static int removeDuplicates(int[] arr, int n) {
		
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<n ; i++) {
			set.add(arr[i]);
		}
		int j =0;
		for(Integer element: set) {
			arr[j++]= element;
		}
		
		return j;
		
		
	}

}
