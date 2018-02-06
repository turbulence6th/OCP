package com.turbulence6th.optional;

import java.util.Optional;

public class ChainingOptional {

	public static void main(String[] args) {

		Optional<Integer> optional = Optional.of(123);
		optional.map(n -> "" + n) 
				.filter(s -> s.length() == 3) 
				.ifPresent(System.out::println);

	}

}
