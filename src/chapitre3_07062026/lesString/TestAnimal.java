package chapitre3_07062026.lesString;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {

	public static void main(String[] args) {
		List<String> repas = new ArrayList<>();
		repas.add("fish");
		repas.add("meat");
		
		Animal a = new Animal("chien",2,repas);
		System.out.println(a.getFoods());
		List<String> temp = a.getFoods();
		temp.clear();
		System.out.println(a.getFoods());

	}

}
