package com.codewithkarthik.nested;

public class NestClass1 {

	public static void main(String[] args) {
		Outer.StaticClass.show();
		Outer.StaticClass inner = new Outer.StaticClass();
		inner.show();

	}

}

class Outer {
	static int x = 10;
	static class StaticClass{
		static void show() {
			System.out.println("Static nested class: show()");
		}
	}
}


