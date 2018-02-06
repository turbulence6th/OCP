package com.turbulence6th.internationalization;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class CreateProperty {

	public static void main(String[] args) {
		
		Locale us = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
		
		Properties props = new Properties();
		rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));

		System.out.println(props.getProperty("notReallyAProperty"));
		System.out.println(props.getProperty("notReallyAProperty", "123"));

	}

}
