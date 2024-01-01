package com.codewithkarthik.ListPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetArrayListFromStream {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,4,5,3,63,53,3,2);
		ArrayList<Integer> arrayListFromStream = getArrayListFromStream(stream);
		System.out.println(arrayListFromStream);
	}

	private static ArrayList<Integer> getArrayListFromStream(Stream<Integer> stream) {
//		
//		List<Integer> list = stream.collect(Collectors.toList());
//		
//		ArrayList<Integer> arrayList = new ArrayList<>(list);
		
		ArrayList<Integer> arrayList = stream.collect(Collectors.toCollection(ArrayList::new));
		return arrayList;
		
		
	}

}
