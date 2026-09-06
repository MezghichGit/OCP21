package day13_06092026;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q14 {

	public static void main(String[] args) {
		List elements = Arrays.asList("car", "truck", "car", "bicycle", "car", "truck", "motorcycle");

		Map outcome = (Map)elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(outcome);
	}

}
