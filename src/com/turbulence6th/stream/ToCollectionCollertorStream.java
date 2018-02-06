package com.turbulence6th.stream;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToCollectionCollertorStream {

	public static void main(String[] args) {
		
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		TreeSet<String> result = ohMy.filter(s -> s.startsWith("t"))
		.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(result); // [tigers]

	}

}
