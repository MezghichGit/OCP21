package day7_05072026.StreamExemple;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemple_Collect {

	public static void main(String[] args) {
		//Stream<String> stream = Stream.of("w", "o", "l", "f","o","w");
		
		//List<String> list = stream.collect(Collectors.toList());
		//Set<String> list = stream.collect(Collectors.toSet());
		//System.out.println(list); //
		
		Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
		long count = stream.filter(s -> s.startsWith("g")).peek(System.out::println).count(); // grizzly
		System.out.println(count); // 1 


	}

}
