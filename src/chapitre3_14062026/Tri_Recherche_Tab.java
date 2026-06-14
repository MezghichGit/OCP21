package chapitre3_14062026;

import java.util.Arrays;

public class Tri_Recherche_Tab {

	public static void main(String[] args) {
		int tab[] = {10,3,6,2};
		Arrays.sort(tab);  // 2 3 6 10
 		System.out.println(Arrays.binarySearch(tab, 2)); // 0
 		System.out.println(Arrays.binarySearch(tab, 6)); // 2
 		System.out.println(Arrays.binarySearch(tab, 11)); // -5
 		System.out.println(Arrays.binarySearch(tab, 4)); // -3
 		
 		int temp[] = {10,3,6,2};
 		System.out.println(Arrays.binarySearch(temp, 2));

	}

}
