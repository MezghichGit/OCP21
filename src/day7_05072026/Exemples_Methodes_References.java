package day7_05072026;

import java.util.*;
import java.util.function.Consumer;

public class Exemples_Methodes_References {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(4);
		
		
		Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);
	
		System.out.println(list);
		lambda1.accept(list);
		System.out.println(list);
		
		// méthode de référence basée sur une méthode static
		Consumer<List<Integer>> methodRef1 = Collections::sort;
		

	}

}
