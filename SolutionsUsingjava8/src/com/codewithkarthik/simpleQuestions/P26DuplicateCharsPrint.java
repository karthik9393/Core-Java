package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class P26DuplicateCharsPrint {

	public static void main(String[] args) {
		String str = "Kothakonda".toLowerCase();
		
		Set<String> uniqueChars = new HashSet<>();
		
		Set<String> duplicates = Arrays.stream(str.split("")).filter(i->!uniqueChars.add(i)).collect(Collectors.toSet());
		
		System.out.println(duplicates);
		
		
		

	}

}
