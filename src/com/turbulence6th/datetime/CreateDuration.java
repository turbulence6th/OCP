package com.turbulence6th.datetime;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class CreateDuration {

	public static void main(String[] args) {
		
		{
			
			Duration daily = Duration.ofDays(1); // PT24H
			Duration hourly = Duration.ofHours(1); // PT1H
			Duration everyMinute = Duration.ofMinutes(1); // PT1M
			Duration everyTenSeconds = Duration.ofSeconds(10); // PT10S
			Duration everyMilli = Duration.ofMillis(1); // PT0.001S
			Duration everyNano = Duration.ofNanos(1); // PT0.000000001S
			
		}
		
		{
			
			Duration daily = Duration.of(1, ChronoUnit.DAYS);
			Duration hourly = Duration.of(1, ChronoUnit.HOURS);
			Duration everyMinute = Duration.of(1, ChronoUnit.MINUTES);
			Duration everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
			Duration everyMilli = Duration.of(1, ChronoUnit.MILLIS);
			Duration everyNano = Duration.of(1, ChronoUnit.NANOS);
			
		}

	}

}
