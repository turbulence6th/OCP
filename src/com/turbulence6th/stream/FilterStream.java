package com.turbulence6th.stream;

import java.util.stream.Stream;

public class FilterStream {

	public static void main(String[] args) {
		
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.filter(x -> x.startsWith("m")).forEach(System.out::print);

	}

}
