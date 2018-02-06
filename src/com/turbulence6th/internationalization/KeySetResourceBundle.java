package com.turbulence6th.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class KeySetResourceBundle {

	public static void main(String[] args) {

		Locale us = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
		Set<String> keys = rb.keySet();
		keys.stream().map(k -> k + " " + rb.getString(k)).forEach(System.out::println);

	}

}
