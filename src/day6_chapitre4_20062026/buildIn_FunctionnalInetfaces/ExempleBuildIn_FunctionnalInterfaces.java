package day6_chapitre4_20062026.buildIn_FunctionnalInetfaces;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExempleBuildIn_FunctionnalInterfaces {

	public static void main(String[] args) {
		//implémentation versbose
		Predicate<String> filter = (String word)-> {return word.contains("ocp");};
		// implémentation réduite
		Predicate<String> filter2 = word ->word.contains("ocp");
		
		System.out.println(filter.test("formation oca ocp spring"));
		System.out.println(filter2.test("formation oca ocp spring"));
		
		//implémentation versbose
		BiConsumer<String,String> identite = 
				(String prenom, String nom)->{System.out.println(prenom+" "+nom);};
				
				identite.accept("Mohamed Amine","Mezghich");
				
	   // implémentation réduite
				
		BiConsumer<String,String> identite2 = 
						(prenom, nom) -> System.out.println(prenom+" "+nom);
						
						identite2.accept("Mohamed Amine","Mezghich");
						
	 Supplier<Double> rnd = ()->Math.random();
	 System.out.println(rnd.get());
	 
	 Function<String,Integer> fn = (String word)->{return word.length();};
	 System.out.println(fn.apply("ocp"));
	 
	 Function<String,Integer> fn2 =  word->word.length();
	 System.out.println(fn2.apply("formation ocp"));
	}

}
