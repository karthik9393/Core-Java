package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNum {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        
		Integer integer = asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(integer);
	}

}
