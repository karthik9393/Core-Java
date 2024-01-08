package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P27FirstRepeated {
	
	public static void main(String[] args) {
		
		String str = "Kothakonda is a Surname".replaceAll("\\s+", "").toLowerCase();
		
		Map<String, Long> charCountMap = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		String firstRepeatedChar = charCountMap.entrySet().stream().filter(entry -> entry.getValue()>1).map(entry-> entry.getKey())
		.findFirst().get();
		
		System.out.println(firstRepeatedChar);
		
		
		
	}
	
	
	
	

}
