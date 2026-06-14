package chapitre3_14062026;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal(100);
		Animal a2 = new Animal(100);
		
		System.out.println(a1 == a2);  // == emplacement mémoire
		System.out.println(a1.equals(a2)); // equals même chose ==

	}

}
