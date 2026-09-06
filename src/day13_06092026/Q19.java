package day13_06092026;

import java.util.List;

public class Q19 {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		//int sum = listOfNumbers.stream().reduce(0, Integer::sum) + 5;
		//int sum = listOfNumbers.parallelStream().reduce(0, Integer::sum) + 5;
		int sum = listOfNumbers.parallelStream().reduce(5, Integer::sum);
	
		System.out.println(sum);

	}

}
