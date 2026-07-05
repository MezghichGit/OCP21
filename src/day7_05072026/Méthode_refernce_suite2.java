package day7_05072026;

import java.util.function.Predicate;

public class Méthode_refernce_suite2 {

	public static void main(String[] args) {
		// Méthode de réference sur une reference inconnue
		
		Predicate<String> lambda3 = s -> s.isEmpty();
		System.out.println(lambda3.test("OCP"));
		
		Predicate<String> methodRef3 = String::isEmpty;
		System.out.println(methodRef3.test("OCP"));

	}

}
