package day7_05072026.optionalType;

import java.util.Optional;

public class Compute_Average {

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);
	}
	public static void main(String[] args) {
		System.out.println(average());
		System.out.println(average(10,20,30).get());
	}
}
