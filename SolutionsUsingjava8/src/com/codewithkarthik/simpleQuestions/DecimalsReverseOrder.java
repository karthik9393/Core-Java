package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DecimalsReverseOrder {

	public static void main(String[] args) {
		List<Double> asList = Arrays.asList(23.45,46.00,67.46,224.60,785.88,2.11,9.22);
		
		  asList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
