package com.codewithkarthik.Strings;

public class PrintEvenLengthWords {

	public static void main(String[] args) {
		String str = "I am learning core java";
		String[] words = str.split(" ");
		for(String word: words) {
			if(word.length()%2==0)
				System.out.println(word);
		}
		

	}

}
