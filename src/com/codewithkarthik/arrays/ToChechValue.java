package com.codewithkarthik.arrays;

public class ToChechValue {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 2, 6, 1, 3, 8, 9 };
		int tocheck = 8;

		tochechValue(arr, tocheck);
		

	}

	private static void tochechValue(int[] arr, int tocheck) {
		boolean test = false;
		for (int element : arr) {
			if (element == tocheck) {
				test = true;
				break;
			}

		}
		System.out.println("Is "+tocheck+" present in array: "+ test);

	}

}
