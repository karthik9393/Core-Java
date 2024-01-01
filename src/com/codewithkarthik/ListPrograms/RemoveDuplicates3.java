package com.codewithkarthik.ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Raju", "Krishna","Raju", "Lingam", "Vijay", "Lingam", "Vijay"));
		
		List<String> newList = removeDuplicates(list);
		System.out.println(newList);
	}

	private static List<String> removeDuplicates(List<String> list) {
		List<String> newList = list.stream().distinct().collect(Collectors.toList());
		
		return newList;
		
	}

}
