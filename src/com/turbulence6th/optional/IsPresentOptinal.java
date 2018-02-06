package com.turbulence6th.optional;

import java.util.Optional;

public class IsPresentOptinal {
	
	public static void main(String[] args) {
	
		{
			Optional<Double> opt = average(90, 100);
			if (opt.isPresent())
				System.out.println(opt.get()); // 95.0
		}
		
		{
			Optional<Double> opt = average();
			System.out.println(opt.get());
		}
		
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
