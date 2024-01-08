package com.codewithkarthik.search;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchCollections {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(20);
		list.add(89);
		
		int index = Collections.binarySearch(list, 89);
		
		
		System.out.println("element found at: "+ index);
	}

	
	
	

}
