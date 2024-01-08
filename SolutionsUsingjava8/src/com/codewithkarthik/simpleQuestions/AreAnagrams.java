package com.codewithkarthik.simpleQuestions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreAnagrams {

	public static void main(String[] args) {
		String s1 = "1RaceCar";
		String s2 = "CarRace1";
		
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		if(s1.equals(s2)) {
			System.out.println("Both are anagrams");
			
		}else
			System.out.println("Two Strings are not anagrams");
	}

}
