package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("Kr", "bharath", "Raju", "Kr", "bharath");
		List<String> collect = asList.stream().distinct().collect(Collectors.toList());

		System.out.println(collect);
	}

}
