package com.codewithkarthik.anshul;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a String, 
//find the first non-repeated character in it using Stream functions?
public class Problem7a {

	public static void main(String[] args) {

		String str = "Java Developer".replaceAll("\\s+", "").toLowerCase();

		LinkedHashMap<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		String string = collect.entrySet().stream().filter(i-> i.getValue()==1).map(Map.Entry::getKey).findFirst().get();
		
		System.out.println(string);
	}

}
