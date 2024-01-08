package com.codewithkarthik.nested;

public class NestClass4 {

	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		

	}

}

class Outer3{
	static int x = 30;
	int y = 20;
	
	class Inner{
		void show() {
			System.out.println(x);
			System.out.println(y);
			
		}
		
	}
}