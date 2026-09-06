package day12_29082026.exemple_record;

public record Animal(int age, String nom) implements Vehicule{

	//double poinds; // erreur
	static int total;
	
	public void infos() {
		System.out.println(this.age);
	}
}
