package com.turbulence6th.stream;

import java.util.stream.Stream;

public class CreatingStream {

	public static void main(String[] args) {
		
		Stream<String> empty = Stream.empty(); // count = 0
		Stream<Integer> singleElement = Stream.of(1); // count = 1
		Stream<Integer> fromArray = Stream.of(1, 2, 3); // count
		
	}

}
