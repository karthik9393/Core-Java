package com.codewithkarthik.anshul;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Given a list of integers, 
//find the maximum value element present in it using Stream functions?
public class Problem6 {

	public static void main(String[] args) {
		
		List<Integer> listOfNums = Arrays.asList(1,2,4,5,2,98,56,44,255);
		
		Optional<Integer> max = listOfNums.stream().max(Integer::compareTo);
		
		System.out.println(max.get());

	}

}
