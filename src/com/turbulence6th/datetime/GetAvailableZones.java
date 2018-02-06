package com.turbulence6th.datetime;

import java.time.ZoneId;

public class GetAvailableZones {

	public static void main(String[] args) {

		ZoneId.getAvailableZoneIds().stream().filter(z -> z.contains("TR") || z.contains("Turkey")).sorted()
				.forEach(System.out::println);

	}

}
