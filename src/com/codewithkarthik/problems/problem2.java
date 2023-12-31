package com.codewithkarthik.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//How do you find all pairs of an integer array 
//whose sum is equal to a given number?
//a.	[4, -5, 9, 11, 25, 13, 12, 8], number = 20 

public class problem2 {
	
	public static void main(String[] args) {
		int[] arr = {4, -5, 9, 11, 25, 13, 12, 8};
		int number = 20;
		
		List<List<Integer>> pairs = findAllPairs(arr, number);
		
		for(List<Integer> pair: pairs) {
			System.out.println(pair);
		}
	}

	private static List<List<Integer>> findAllPairs(int[] arr, int target) {
		List<List<Integer>> result = new ArrayList<>();
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num: arr) {
			int complement = target - num;
			if(map.containsKey(complement)) {
				List<Integer> pair = new ArrayList<>();
				pair.add(num);
				pair.add(complement);
				result.add(pair);
			}
			map.put(num, 1);
		}
		return result;
	}

}
