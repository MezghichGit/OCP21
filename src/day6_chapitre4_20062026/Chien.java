package day6_chapitre4_20062026;

public class Chien extends Animal{
	String nom = "OCP";
	public Chien(String nom) {
		super(nom); // appel au constructeur avec paramètre de la classe Animal
	
	System.out.println(super.nom +" "+this.nom);
	}

}
