package com.codewithkarthik.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {2,5,75,5,7,4,2};
		int x = 4;
		int index = search(arr, x);
		if(index == -1) {
			System.out.println("element not found!");
			
		}else {
			System.out.println("element found at : "+ index);
		}

	}

	static int search(int[] arr, int x) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
	

}
