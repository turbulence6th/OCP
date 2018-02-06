package com.turbulence6th.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Subpath {

	public static void main(String[] args) {
		
		Path path = Paths.get("/mammal/carnivore/raccoon.image");
		System.out.println("Path is: "+path);
		System.out.println("Subpath from 0 to 3 is: "+path.subpath(0,3));
		System.out.println("Subpath from 1 to 3 is: "+path.subpath(1,3));
		System.out.println("Subpath from 1 to 2 is: "+path.subpath(1,2));
		
	}

}
