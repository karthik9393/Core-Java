package com.codewithkarthik.ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Raju", "Krishna","Raju", "Lingam", "Vijay", "Lingam", "Vijay"));
		
		List<String> newList = removeDuplicates(list);
		System.out.println(newList);

	}

	private static List<String> removeDuplicates(List<String> list) {
		List<String> newList = new ArrayList<>();
		for(String element : list) {
			if(!newList.contains(element)) {
				newList.add(element);
			}
		}
		return newList;
		
		
	}

}
