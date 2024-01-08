package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(12,36,66,53,3,5,6,6);
		
		List<Integer> list2 = Arrays.asList(12,5,4,5,2,5,6,66);
		
		list1.stream().filter(list2::contains).forEach(System.out::println);
		
		
	}

}
