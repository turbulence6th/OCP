package com.turbulence6th.stream;

import java.util.stream.Stream;

public class DistinctStream {

	public static void main(String[] args) {
		
		Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
		s.distinct().forEach(System.out::print); // duckgoose

	}

}
