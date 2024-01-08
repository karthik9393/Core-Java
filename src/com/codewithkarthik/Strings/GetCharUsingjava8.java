package com.codewithkarthik.Strings;

//Using Java 8 Streams:
//Get the string and the index
//Convert String into IntStream using String.chars() method.
//Convert IntStream into Stream using IntStream.mapToObj() method.
//Convert Stream into Character[] using toArray() method.
//Get the element at the specific index from this character array.
//Return the specific character.
public class GetCharUsingjava8 {

	public static void main(String[] args) {
		String str = "RajeshSarikonda";
		int index = 5;
		char charFromstr = getCharUsingJava(str, index);
		
		System.out.println("From the above str: "+str+ " the char at index "+index+" is: "+charFromstr);
		

	}

	private static char getCharUsingJava(String str, int index) {
		
		return str.chars().mapToObj(ch -> (char)ch).toArray(Character[]::new)[index];
		
		
	}

}
