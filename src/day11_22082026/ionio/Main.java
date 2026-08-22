package day11_22082026.ionio;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		//System.out.println(System.getProperty("file.separator"));
		//System.out.println(java.io.File.separator);
		
		File file = new File("/home/smith/data/zoo.txt");
		System.out.println(file.exists());
		
		File parent = new File("/home/smith");
		parent = null;
		File child = new File(parent,"data/zoo.txt");
		System.out.println(child);

	}

}
