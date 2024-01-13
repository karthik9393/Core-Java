package com.codewithkarthik.anshul;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

//Given a String, 
//find the first non-repeated character in it using Stream functions?

public class Problem7 {

	public static void main(String[] args) {
		
		List<Integer> listOfNums = Arrays.asList(1,2,4,5,7,5,2,3,45,47,9,1,5);
		
		Map<Integer, Long> collect = listOfNums.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
		  Integer integer = collect.entrySet().stream().filter(entry -> entry.getValue()==1).map(Map.Entry::getKey).findFirst().get();
		
		System.out.println("First non-repeated char" + integer);

	}

}
