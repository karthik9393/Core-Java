package com.codewithkarthik.arrays;

//Algorithm:
//
//1.Compare adjacent elements with each other.
//2.Use nested for loop to keep track.
//3.Swap the elements if the first element is greater than
//the second element.
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { -58, -8, 66, -78, 5, 2, 48, 396, -54 };
		System.out.println("Before Sorting....");
		printArray(arr);
		sortArray(arr);
		System.out.println("\n After sorting....");
		printArray(arr);

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void sortArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

}
