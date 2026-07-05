package day7_05072026;

import java.util.function.Predicate;

public class Methode_Reference_suite {

	public static void main(String[] args) {
		// méthode de référence basé sur une méthode d'instance (startsWith) sur une instance fixe (str)
		String str = "abc";
		Predicate<String> lambda2 = s -> str.startsWith(s);
		System.out.println(lambda2.test("a"));
		
		Predicate<String> methodRef2 = str::startsWith;
		System.out.println(methodRef2.test("a"));

	}

}
