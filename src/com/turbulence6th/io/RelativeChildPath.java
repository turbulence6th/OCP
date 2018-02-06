package com.turbulence6th.io;

import java.io.File;

public class RelativeChildPath {
	
	public static void main(String[] args) {
		
		File parent = new File("/home/smith");
		File child = new File(parent, "data/zoo.txt");
		
	}

}
