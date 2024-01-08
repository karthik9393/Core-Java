package com.codewithkarthik.simpleQuestions;

import java.util.stream.IntStream;

public class SumOf10 {

	public static void main(String[] args) {
		
		int sum = IntStream.range(1, 11).sum();
		System.out.println(sum);

	}

}
