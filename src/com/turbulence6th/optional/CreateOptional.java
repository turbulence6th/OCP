package com.turbulence6th.optional;

import java.util.Optional;

public class CreateOptional {

	public static void main(String[] args) {

		System.out.println(average());
		System.out.println(average(90, 100));
		
	}

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();

		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);
	}

}
