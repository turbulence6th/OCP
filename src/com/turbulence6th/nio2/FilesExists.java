package com.turbulence6th.nio2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesExists {

	public static void main(String[] args) {
		
		Files.exists(Paths.get("/ostrich/feathers.png"));
		Files.exists(Paths.get("/ostrich"));

	}

}
