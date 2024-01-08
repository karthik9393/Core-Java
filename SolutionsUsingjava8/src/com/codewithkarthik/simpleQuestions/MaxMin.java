package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(21,4,5,6,5,4,56,4,6,7,74,-11);
		Integer max = asList.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max);
		
		Integer min = asList.stream().min(Comparator.naturalOrder()).get();
		System.out.println(min);
	}

}
