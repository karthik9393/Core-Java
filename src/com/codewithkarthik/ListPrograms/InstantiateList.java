package com.codewithkarthik.ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InstantiateList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,4,5);
		
		//its an immutable list
		//list.add(5);
		System.out.println(list);
		
		
		List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,4));
		//its a mutable list.
		l1.add(5);
		Collections.addAll(l1, 1232,4564,2,453,2);
		System.out.println(l1);

	}

}
