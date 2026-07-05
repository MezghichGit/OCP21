package day6_chapitre4_20062026;

public class Animal {
	String nom = "OCA";
	public Animal() {
		System.out.println("Hello Animal");
	}
	
	public Animal(String nom) {
		this();  //appel du constructeur par défaut de la même classe
		System.out.println("Hello : "+ nom);
	}

}
