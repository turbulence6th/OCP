package com.turbulence6th.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbers {

	public static void main(String[] args) {
		{
			int attendeesPerYear = 3_200_000;
			int attendeesPerMonth = attendeesPerYear / 12;
			NumberFormat us = NumberFormat.getInstance(Locale.US);
			System.out.println(us.format(attendeesPerMonth));
			NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
			System.out.println(g.format(attendeesPerMonth));
			NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
			System.out.println(ca.format(attendeesPerMonth));
		}
		
		{
			double price = 48;
			NumberFormat us = NumberFormat.getCurrencyInstance();
			System.out.println(us.format(price));
		}
		
	}
}
