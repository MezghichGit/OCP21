package day12_29082026.nio2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		Path path1 = Paths.get("C:\\birds\\egret.txt");
		System.out.println("Path1 is Absolute? "+path1.isAbsolute());
		System.out.println("Absolute Path1: "+path1.toAbsolutePath());
		Path path2 = Paths.get("birds/condor.txt");
		System.out.println("Path2 is Absolute? "+path2.isAbsolute());
		System.out.println("Absolute Path2 "+path2.toAbsolutePath());
		*/
		Path path3 = Paths.get("E:\\data");
		Path path4 = Paths.get("E:\\user\\home");
		Path relativePath = path3.relativize(path4);
		System.out.println(path3.resolve(relativePath));
		System.out.println(path3.resolve(relativePath).normalize());
		System.out.println(Paths.get(".").toRealPath()); 

	}

}
