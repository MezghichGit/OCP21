package chapitre3_14062026;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing_Unboxing {

	public static void main(String[] args) {
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		System.out.println( heights.get(0));
		int h = heights.get(0); 

	}

}
