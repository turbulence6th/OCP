package com.turbulence6th.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedStream {

	public static void main(String[] args) {

		{
			Stream<String> s = Stream.of("brown-", "bear-");
			s.sorted().forEach(System.out::print); // bear-brown
		}

		{
			Stream<String> s = Stream.of("brown bear-", "grizzly-");
			s.sorted(Comparator.reverseOrder()).forEach(System.out::print); // grizzly-brown
																			// bear-
		}
	
	}

}
