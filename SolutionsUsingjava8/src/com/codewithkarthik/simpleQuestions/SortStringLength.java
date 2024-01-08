package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringLength {

	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		asList.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		
	}

}
