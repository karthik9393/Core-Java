package com.codewithkarthik.search;

//The idea is to search the element from both the sides of array recursively.
public class LinearSearchRecursively {

	public static void main(String[] args) {
		int[] arr = {25,4,5,78,5,66,9};
		int start = 0;
		int end = arr.length-1;
		int target = 66;
		int index = recursiveSearch(arr, start, end, target);
		if(index == -1)
			System.out.println("Element not found!");
		else
			System.out.println("element found at: "+ index);

	}
	
	static int recursiveSearch(int[] arr, int start, int end, int target) {
		
		if(end<start) {
			return -1;
		}
		
		if(arr[start] == target)
			return start;
		
		if(arr[end] == target)
			return end;
		
		
		return recursiveSearch(arr, start+1, end-1, target);
	}

}
