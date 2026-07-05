package day7_05072026;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfPredicate {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("ocp");
		names.add("oca");
		names.add("spring");
		names.add("devops");
		names.add("scrum");
		names.add("test");
		System.out.println(names);
		Predicate<String> filter = word -> word.contains("s");
		names.removeIf(filter);
		System.out.println(names);
	}

}
