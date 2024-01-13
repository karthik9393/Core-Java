package com.codewithkarthik.anshul;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

//Given a list of integers, 
//sort all the values present in it in descending order using Stream functions?
public class Problem10 {

	public static void main(String[] args) {
		
		List<Integer> listOfNums = Arrays.asList(1,5,6,79,64,2);
		//listOfNums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//listOfNums.stream().iterator();
		IntStream.range(2, 11).forEach(System.out::println);
		
		

	}

}
