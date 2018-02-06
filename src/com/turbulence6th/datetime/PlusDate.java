package com.turbulence6th.datetime;

import java.time.LocalDate;
import java.time.Month;

public class PlusDate {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date); // 2014–01–20
		date = date.plusDays(2);
		System.out.println(date); // 2014–01–22
		date = date.plusWeeks(1);
		System.out.println(date); // 2014–01–29
		date = date.plusMonths(1);
		System.out.println(date); // 2014–02–28
		date = date.plusYears(5);
		System.out.println(date);

	}

}
