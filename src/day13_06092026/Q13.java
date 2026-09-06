package day13_06092026;

import java.util.stream.Stream;

public class Q13 {

	public static void main(String[] args) {
		Stream s1 = Stream.of("A", "B", "C", "B");
		Stream s2 = Stream.of("A", "D", "E");
		((Stream) Stream.concat(s1, s2).parallel()).distinct().forEach(element -> System.out.print(element));

	}

}
