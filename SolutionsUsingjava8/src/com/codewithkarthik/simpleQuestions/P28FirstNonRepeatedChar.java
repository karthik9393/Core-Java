package com.codewithkarthik.simpleQuestions;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P28FirstNonRepeatedChar {

	public static void main(String[] args) {


		String str = "Sanga is a Sarname".replaceAll("\\s+", "").toLowerCase();
		
		Map<String, Long> charsCount = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		String firstNonRepeated = charsCount.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst().get();
		System.out.println(firstNonRepeated);
	}

}
