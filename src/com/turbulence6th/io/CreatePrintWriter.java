package com.turbulence6th.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreatePrintWriter {
	
	public static void main(String[] args) throws FileNotFoundException {
		try(PrintWriter out = new PrintWriter("zoo.log")) {
			out.print(5); // PrintWriter method
			out.write(String.valueOf(5)); // Writer method
			out.print(2.0); // PrintWriter method
			out.write(String.valueOf(2.0)); // Writer method
			Animal animal = new Animal("abcd", 1, 'a');
			out.print(animal); // PrintWriter method
			out.write(animal==null ? "null": animal.toString()); // Writer method
		}
		
	}

}
