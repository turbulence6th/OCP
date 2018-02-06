package com.turbulence6th.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Resolve {

	public static void main(String[] args) {
		
		{
			final Path path1 = Paths.get("/cats/../panther");
			final Path path2 = Paths.get("food");
			System.out.println(path1.resolve(path2));
		}
		
		{
			final Path path1 = Paths.get("/turkey/food");
			final Path path2 = Paths.get("/tiger/cage");
			System.out.println(path1.resolve(path2));
		}
		
	}

}
