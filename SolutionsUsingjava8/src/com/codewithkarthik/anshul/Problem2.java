package com.codewithkarthik.anshul;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, 
//find out all the numbers starting with 1 using Stream functions?
public class Problem2 {

	public static void main(String[] args) {

		List<Integer> listOfNums = Arrays.asList(123, 45, 78, 12, 45, 19, 1, 6, 221, 177);

		List<Integer> numsStarts1 = listOfNums.stream().filter(num -> String.valueOf(num).startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(numsStarts1);

	}

}
