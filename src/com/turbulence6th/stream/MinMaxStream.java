package com.turbulence6th.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class MinMaxStream {

	public static void main(String[] args) {
		
		Stream<String> s = Stream.of("monkey", "ape", "bonobo");
		Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length());
		min.ifPresent(System.out::println); // ape

	}

}
