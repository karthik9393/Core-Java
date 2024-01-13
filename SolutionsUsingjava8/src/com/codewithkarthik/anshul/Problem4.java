package com.codewithkarthik.anshul;

import java.util.Arrays;
import java.util.List;

//Given the list of integers, 
//find the first element of the list using Stream functions?
public class Problem4 {

	public static void main(String[] args) {
		
		List<Integer> listOfNums = Arrays.asList(3,2,1,5,6);
		Integer firstElement = listOfNums.stream().findFirst().get();
		System.out.println(firstElement);

	}

}
