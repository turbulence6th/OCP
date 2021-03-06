package com.turbulence6th.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AveragingIntCollectorStream {

	public static void main(String[] args) {
		
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		Double result = ohMy.collect(Collectors.averagingInt(String::length));
		System.out.println(result); // 5.333333333333333

	}

}
