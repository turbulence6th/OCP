package com.turbulence6th.supplier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class CreateSupplier {
	
	public static void main(String[] args) {
		
		{
			Supplier<LocalDate> s1 = LocalDate::now;
			Supplier<LocalDate> s2 = () -> LocalDate.now();
			LocalDate d1 = s1.get();
			LocalDate d2 = s2.get();
			System.out.println(d1);
			System.out.println(d2);
		}
		
		{
			Supplier<StringBuilder> s1 = StringBuilder::new;
			Supplier<StringBuilder> s2 = () -> new StringBuilder();
			System.out.println(s1.get());
			System.out.println(s2.get());
		}
		
		{
			Supplier<ArrayList<String>> s1 = ArrayList<String>::new;
			ArrayList<String> a1 = s1.get();
			System.out.println(a1);
		}
		
	}

}
