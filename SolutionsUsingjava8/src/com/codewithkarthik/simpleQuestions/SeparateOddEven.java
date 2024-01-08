package com.codewithkarthik.simpleQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparateOddEven {

	public static void main(String[] args) {
		
		List<Integer> listOfNums = Arrays.asList(234,566,64,2,677,34,6);
		
		Map<Boolean, List<Integer>> evenOddNums = listOfNums.stream().collect(Collectors.partitioningBy(i->i%2==0));
		
		//System.out.println(evenOddNums);
		
		Set<Entry<Boolean, List<Integer>>> entrySet = evenOddNums.entrySet();
		for (Entry<Boolean, List<Integer>> entry : entrySet) {
			if(entry.getKey()) {
				System.out.println("Even Numbers are:");
				
			}else {
				System.out.println("Odd numbers are: ");
				
			}
			List<Integer> value = entry.getValue();
			for(int i: value) {
				System.out.println(i);
			}
		}
	}

}
