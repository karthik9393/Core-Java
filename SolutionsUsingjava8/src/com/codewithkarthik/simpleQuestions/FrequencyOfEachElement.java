package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Pen","Pen", "pen","Book", "pencil","pencil");
		
		Map<String, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);

	}

}
