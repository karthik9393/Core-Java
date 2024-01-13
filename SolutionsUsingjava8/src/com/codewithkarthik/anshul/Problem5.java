package com.codewithkarthik.anshul;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, 
//find the total number of elements present in the list using Stream functions?
public class Problem5 {

	public static void main(String[] args) {
		
		List<Integer> listOfNums = Arrays.asList(7,1,2,4,5,4,5,4,2,4,8);
		Long count = listOfNums.stream().collect(Collectors.counting());
		System.out.println(count);
		
		
		
	}

}
