package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixSuffix {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("apple", "banana","cat", "dog");
		String collect = asList.stream().collect(Collectors.joining(",", "[", "]"));

		System.out.println(collect);
	}

}
