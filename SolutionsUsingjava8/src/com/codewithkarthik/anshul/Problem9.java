package com.codewithkarthik.anshul;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, sort all the values present in it using Stream functions?
public class Problem9 {

	public static void main(String[] args) {
		
		List<Integer> listOfNums = Arrays.asList(5,4,2,7,9,4);
		
		
		//System.out.println(listOfNums.stream().sorted().toString());
		//wrong as .sorted is a stream, it prints the string representation of the stream object
		
		//correct : collect it to list and print or use forEach default method.
		listOfNums.stream().sorted().forEach(System.out::println);
		

	}

}
