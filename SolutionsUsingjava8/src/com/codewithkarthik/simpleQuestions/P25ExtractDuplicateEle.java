package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P25ExtractDuplicateEle {

	public static void main(String[] args) {
		List<Integer> listOfnum = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
		
		Set<Integer> uniqueElements = new HashSet<>();
		
		listOfnum.stream().filter(i->!uniqueElements.add(i)).collect(Collectors.toSet()).forEach(System.out::println);
		
		

	}

}
