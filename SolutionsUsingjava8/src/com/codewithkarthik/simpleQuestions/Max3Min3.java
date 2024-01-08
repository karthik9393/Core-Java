package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max3Min3 {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(23,6,7,444,7,855,3,6567,7,33,35,87,51,2);
		
		System.out.println("3 minimum numbers are:");
		asList.stream().sorted().limit(3).forEach(System.out::println);
		
		System.out.println("Max numbers are:");
		asList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		

	}

}
