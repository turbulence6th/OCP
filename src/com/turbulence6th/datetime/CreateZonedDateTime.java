package com.turbulence6th.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CreateZonedDateTime {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
		
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20,
		6, 15, 30, 200, zone);
		ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
		ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);

	}

}
