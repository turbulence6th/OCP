package com.turbulence6th.stream;

import java.util.stream.Stream;

public class MapStream {

	public static void main(String[] args) {
		
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.map(String::length).forEach(System.out::print);

	}

}
