package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.List;

public class NumbersMultiplesOf5 {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(32,15,54,56,74,3,35,78,85);
		
		asList.stream().filter(s->s%5==0).forEach(System.out::println);

	}

}
