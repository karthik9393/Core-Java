package com.codewithkarthik.ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListtoString {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("karthik", "Java", "Developer"));
		
		String listtoString = listtoString(list);
		System.out.println(listtoString);

	}

	private static String listtoString(List<String> list) {
		String join = String.join(",", list);
		return join;
		
		
	}

}
