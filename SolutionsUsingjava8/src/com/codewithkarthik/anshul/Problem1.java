package com.codewithkarthik.anshul;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, 
//find out all the even numbers exist in the list using Stream functions?
public class Problem1 {

	public static void main(String[] args) {
		
		List<Integer> listOfNums = Arrays.asList(1,2,3,4,5,6,7,9,7,5,4,6);
		
		listOfNums.stream().filter(i->(i%2==0)).forEach(System.out::println);

	}

}
