package com.codewithkarthik.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class StudentSorting {

	public static void main(String[] args) {
		Student[] arr = {new Student(111, "Bhai", "kukatpally"),
							new Student(122, "Dheeraj", "panama"),
							new Student(112, "Rajji", "Vijayawada")};
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr, new sortOnRollNo());
		
		System.out.println(" After sorting.....");
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}

class Student{
	int rollNo;
	String name;
	String address;
	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
	
	
}


class sortOnRollNo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.rollNo - o2.rollNo;
	}
	
}