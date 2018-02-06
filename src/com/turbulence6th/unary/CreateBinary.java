package com.turbulence6th.unary;

import java.util.function.BinaryOperator;

public class CreateBinary {

	public static void main(String[] args) {
		
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(b1.apply("baby ", "chick")); // baby chick
		System.out.println(b2.apply("baby ", "chick")); // baby chick

	}

}
