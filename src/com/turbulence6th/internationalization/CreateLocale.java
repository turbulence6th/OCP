package com.turbulence6th.internationalization;

import java.util.Locale;

public class CreateLocale {

	public static void main(String[] args) {

		{
			System.out.println(Locale.GERMAN); // de
			System.out.println(Locale.GERMANY); // de_DE
		}

		{
			System.out.println(new Locale("fr")); // fr
			System.out.println(new Locale("hi", "IN")); // hi_IN
		}

		{
			Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US").build();
			Locale l2 = new Locale.Builder().setRegion("US").setLanguage("en").build();
		}
	}

}
