package com.turbulence6th.stream;

import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TreeMapCollectorStream {
	
	public static void main(String[] args) {
		
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		TreeMap<Integer, String> map = ohMy.collect(Collectors.toMap(
		String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new));
		System.out.println(map); // // {5=lions,bears, 6=tigers}
		System.out.println(map.getClass()); // class. java.util.TreeMap
		
	}

}
