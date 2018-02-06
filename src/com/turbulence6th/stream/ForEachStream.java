package com.turbulence6th.stream;

import java.util.stream.Stream;

public class ForEachStream {

	public static void main(String[] args) {
		
		Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
		s.forEach(System.out::print); // MonkeyGorillaBonobo

	}

}
