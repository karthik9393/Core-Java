package com.codewithkarthik.nested;

public class NestClass2 {

	public static void main(String[] args) {
		Outer1.StaticInner.show();
		Outer1.StaticInner inner = new Outer1.StaticInner();
		inner.show();

	}

}

class Outer1 {
	static int x = 10;
	int y = 20;
	 
	static class StaticInner{
		static void show() {
			System.out.println(x);
			//System.out.println(y);
		}
	}
}
