package com.turbulence6th.stream;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceStream {

	public static void main(String[] args) {
		
		{
			Stream<String> stream = Stream.of("w", "o", "l", "f");
			String word = stream.reduce("", (s, c) -> s + c);
			System.out.println(word); // wolf
		}
		
		{
			Stream<String> stream = Stream.of("w", "o", "l", "f");
			String word = stream.reduce("", String::concat);
			System.out.println(word); // wolf
		}
		
		{
			Stream<Integer> stream = Stream.of(3, 5, 6);
			System.out.println(stream.reduce(1, (a, b) -> a*b));
		}
		
		{
			BinaryOperator<Integer> op = (a, b) -> a * b;
			Stream<Integer> empty = Stream.empty();
			Stream<Integer> oneElement = Stream.of(3);
			Stream<Integer> threeElements = Stream.of(3, 5, 6);
			empty.reduce(op).ifPresent(System.out::print); // no output
			oneElement.reduce(op).ifPresent(System.out::print); // 3
			threeElements.reduce(op).ifPresent(System.out::println); // 90
		}
		
		{
			BinaryOperator<Integer> op = (a, b) -> a * b;
			Stream<Integer> stream = Stream.of(3, 5, 6);
			System.out.println(stream.reduce(1, op, op)); // 90
		}
		
	}

}
