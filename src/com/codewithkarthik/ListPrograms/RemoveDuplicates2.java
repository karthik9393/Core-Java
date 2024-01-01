package com.codewithkarthik.ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Raju", "Krishna","Raju", "Lingam", "Vijay", "Lingam", "Vijay"));
		
		List<String> newList = removeDuplicates(list);
		System.out.println(newList);
	}

	private static List<String> removeDuplicates(List<String> list) {
		Set<String> set = new LinkedHashSet<>();
		set.addAll(list);
		list.clear();
		list.addAll(set);
		return list;
		
	}

}
