package com.codewithkarthik.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Print out even length words in a list of Strings using Streams
public class PrintEvenLengthWords2 {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>(Arrays.asList("karthik", "raju", "Aruna", "Krishna"));
		
			strings.stream()
			.filter(s->((s.length()%2)==0))
			.forEach(s->System.out.println(s));
			
		

	}

}
