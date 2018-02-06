package com.turbulence6th.stream;

import java.util.stream.Stream;

public class CountStream {

	public static void main(String[] args) {
		
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		System.out.println(s.count());

	}

}
