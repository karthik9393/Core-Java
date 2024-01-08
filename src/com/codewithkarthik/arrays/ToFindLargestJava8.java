package com.codewithkarthik.arrays;

import java.util.Arrays;

public class ToFindLargestJava8 {

	public static void main(String[] args) {
		int arr[] = {78,56,489,5623,89};
		//java8(arr);
		usingSorting(arr);

	}

	private static void usingSorting(int[] arr) {
		Arrays.sort(arr);
		System.out.println("The largest is : "+ arr[arr.length-1]);
	}

	private static void java8(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("the largest is: "+ max);
	}

}
