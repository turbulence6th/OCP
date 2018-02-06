package com.turbulence6th.internationalization;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class VariableInResourceBundle {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", Locale.US);
		String format = rb.getString("helloByName"); // Hello, {0}
		String formatted = MessageFormat.format(format, "Tammy");
		System.out.print(formatted);

	}

}
