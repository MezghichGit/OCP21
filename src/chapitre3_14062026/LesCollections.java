package chapitre3_14062026;

import java.util.ArrayList;
import java.util.List;

public class LesCollections {

	public static void main(String[] args) {
	
		
		// avant Java 5, pas de generics
		/*
		List names = new ArrayList();
		
		names.add("amine");
		names.add(10);
		names.add(true);
		for(Object name : names)
		{
			String temp = (String)name;
			System.out.println(temp.toUpperCase());
		}
		*/
		// Java 5, intégration de generics
				
		List<String> names = new ArrayList<>();
				
		names.add("amine");
		names.add("10");
		names.add("true");
		for(Object name : names)
		{
		 String temp = (String)name;
		System.out.println(temp.toUpperCase());
		}
		// Quelques méthodes à retenir
		// add (E e), add (int index, E e), remove (E e), remove (int index), contains (E e), clear()
		
		List<String> cours = new ArrayList();
		cours.add(null);
				
	}

}
