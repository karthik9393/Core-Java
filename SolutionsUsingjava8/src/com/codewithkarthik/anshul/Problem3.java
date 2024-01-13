package com.codewithkarthik.anshul;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//How to find duplicate elements in a given integers list in java using Stream functions?
public class Problem3 {

	public static void main(String[] args) {
		
		List<Integer> listOfNums = Arrays.asList(1,2,4,5,4,4,56,4,5,5,4,2);
		
		Map<Integer, Long> collect = listOfNums.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
		
		List<Integer> collect2 = collect.entrySet().stream().filter(i-> i.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println("Duplicates :" + collect2);
	}

}
