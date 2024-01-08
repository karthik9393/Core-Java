package com.codewithkarthik.simpleQuestions;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class P32FindAgeOfPerson {

	public static void main(String[] args) {
		
		LocalDate birthday = LocalDate.of(1999, 12, 02);
		LocalDate today = LocalDate.now();
		
		System.out.println(ChronoUnit.YEARS.between(birthday, today));
		System.out.println(ChronoUnit.MONTHS.between(birthday, today));
		System.out.println(ChronoUnit.DAYS.between(birthday, today));

	}

}
