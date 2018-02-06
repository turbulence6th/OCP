package com.turbulence6th.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PlusPeriod {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period = Period.ofMonths(1);
		System.out.println(date.plus(period)); // 2015–02–20
		System.out.println(dateTime.plus(period)); // 2015–02–20T06:15
		System.out.println(time.plus(period));
		
	}

}
