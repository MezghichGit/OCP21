package day8_12072026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exo_PrimitiveStream {

	public static void main(String[] args) {
		
		
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);
		
		IntStream rangeClosed = IntStream.rangeClosed(1, 5);
		rangeClosed.forEach(System.out::println);
		
		System.out.println(
		Stream.iterate(1, x -> ++x)
	      .limit(5)
	      .map(x -> ""+x)
	      .collect(Collectors.joining()));
		
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(4, 5, 6);
		List<Integer> l3 = Arrays.asList();

		Stream.of(l1, l2, l3)
		      .flatMap(x -> x.stream())
		      .map(x -> x + 1)
		      .forEach(System.out::print);

	}

}
