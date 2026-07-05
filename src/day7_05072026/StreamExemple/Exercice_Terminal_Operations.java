package day7_05072026.StreamExemple;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Exercice_Terminal_Operations {

	public static void main(String[] args) {
		Stream<String> infinite = Stream.generate(() -> "chimp");
		
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		System.out.println(infinite.anyMatch(pred)); 
		
		
		List<String> list = Arrays.asList("monkey", "2", "chimp");
		System.out.println(list.stream().anyMatch(pred)); // true
		System.out.println(list.stream().allMatch(pred)); // false
		System.out.println(list.stream().noneMatch(pred)); // false
		
		//infinite.forEach(System.out::println);

	}

}
