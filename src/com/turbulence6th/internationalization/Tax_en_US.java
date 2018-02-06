package com.turbulence6th.internationalization;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Tax_en_US extends ListResourceBundle {
	protected Object[][] getContents() {
		return new Object[][] { { "tax", "TAX" } };
	}

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.turbulence6th.internationalization.Tax", Locale.US);
		System.out.println(rb.getObject("tax"));
	}
}