package com.codewithkarthik.simpleQuestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachChar {

	public static void main(String[] args) {
		String input = "I am a Java Developer";
		
		Map<Character, Long> collect = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
	}

}
