package com.codewithkarthik.nested;

public class NestClass3 {
	public static void main(String[] args) {
		Outer2.StaticInner.show();
		Outer2.StaticInner inner = new Outer2.StaticInner();
		inner.disply();
		
	}

}

class Outer2 {
	static class StaticInner {
		static void show() {
			System.out.println("static method: Inner class");
			
		}
		
		void disply() {
			System.out.println("Instance method: Inner class");
		}
		
		
	}
	
	public static void main(String[] a) {
		
	}
}