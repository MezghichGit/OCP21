package day7_05072026.StreamExemple;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Exemple {

	public static void main(String[] args) {
		//List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");

		//list.stream().filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);
		//Stream<Double> randoms = Stream.generate(Math::random);
		//System.out.println(randoms);
		//randoms.limit(3).forEach(System.out::println);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		//oddNumbers.limit(3).forEach(System.out::println);
		long nbr = oddNumbers.limit(3).count();
		System.out.println(nbr);
		
		Stream<Double> randoms = Stream.generate(Math::random);
		Optional<Double> res = randoms.findFirst();
		res.ifPresent(System.out::println);
	}

}
