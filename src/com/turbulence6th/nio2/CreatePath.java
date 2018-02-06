package com.turbulence6th.nio2;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePath {

	public static void main(String[] args) throws URISyntaxException {

		{
			Path path1 = Paths.get("pandas/cuddly.png");
			Path path2 = Paths.get("c:\\zooinfo\\November\\employees.txt");
			Path path3 = Paths.get("/home/zoodirector");
		}

		{
			Path path1 = Paths.get("pandas", "cuddly.png");
			Path path2 = Paths.get("c:", "zooinfo", "November", "employees.txt");
			Path path3 = Paths.get("/", "home", "zoodirector");
		}

		{
			Path path1 = Paths.get(new URI("file://pandas/cuddly.png")); // THROWS
																			// EXCEPTION
																			// AT
																			// RUNTIME
			Path path2 = Paths.get(new URI("file:///c:/zoo-info/November/employees.txt"));
			Path path3 = Paths.get(new URI("file:///home/zoodirectory"));
			Path path4 = Paths.get(new URI("http://www.wiley.com"));
			Path path5 = Paths.get(new URI("ftp://username:password@ftp.the-ftp-server.com"));
		}

		{
			Path path1 = FileSystems.getDefault().getPath("pandas/cuddly.png");
			Path path2 = FileSystems.getDefault().getPath("c:", "zooinfo", "November", "employees.txt");
			Path path3 = FileSystems.getDefault().getPath("/home/zoodirector");
		}

		{
			FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://www.selikoff.net"));
			Path path = fileSystem.getPath("duck.txt");
		}
		
		{
			File file = new File("pandas/cuddly.png");
			Path path = file.toPath();
		}
		
		{
			Path path = Paths.get("cuddly.png");
			File file = path.toFile();
		}

	}

}
