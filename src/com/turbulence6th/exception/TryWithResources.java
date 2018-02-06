package com.turbulence6th.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResources {

	public void newApproach(Path path1, Path path2) throws IOException {
		try (BufferedReader in = Files.newBufferedReader(path1); BufferedWriter out = Files.newBufferedWriter(path2)) {

			out.write(in.readLine());
		}
	}

}
