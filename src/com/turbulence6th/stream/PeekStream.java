package com.turbulence6th.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PeekStream {

	public static void main(String[] args) {

		{
			Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
			long count = stream.filter(s -> s.startsWith("b")).peek(System.out::println).count(); // grizzly
			System.out.println(count); // 1
		}
		
		{
			List<Integer> numbers = new ArrayList<>();
			List<Character> letters = new ArrayList<>();
			numbers.add(1);
			letters.add('a');
			StringBuilder builder = new StringBuilder();
			Stream<List<?>> good = Stream.of(numbers, letters);
			good.peek(l -> builder.append(l)).map(List::size).forEach(System.out::print); // 11
			System.out.println(builder); // [1][a]
		}
		
	}

}
