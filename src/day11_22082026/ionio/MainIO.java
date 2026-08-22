package day11_22082026.ionio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainIO {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Amine\\Desktop\\Lab_Jenkins\\zoo.txt"))) 
		{
			  System.out.println(bufferedReader.readLine());
	    }
		
		try (FileReader fileReader = new FileReader("C:\\Users\\Amine\\Desktop\\Lab_Jenkins\\zoo.txt")) 
		{
			  System.out.println((char)fileReader.read());
	    }

	}

}
