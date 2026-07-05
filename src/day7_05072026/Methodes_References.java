package day7_05072026;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Methodes_References {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		//map.put("chicken", 7);
		//map.put("fish", 8);
		
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		
		System.out.println(map); 

	}

}
