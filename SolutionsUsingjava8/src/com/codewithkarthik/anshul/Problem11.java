package com.codewithkarthik.anshul;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

//Write a Java 8 program to add prefix and suffix to the String?
public class Problem11 {

	public static void main(String[] args) {
		
		List<String> listofStr = Arrays.asList("abc", "apple");
		
		StringJoiner sj = new StringJoiner(",");
		
		listofStr.stream().map(wd -> "pre"+wd+"suf").forEach(System.out::println);

	}

}
