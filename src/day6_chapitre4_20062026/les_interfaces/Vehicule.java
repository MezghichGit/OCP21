package day6_chapitre4_20062026.les_interfaces;

public interface Vehicule {
	public static final double VITESS_MAX = 280;
	// avant java 8 : on a le droit à seulement des méthodes abstraites dans une interface
	public void seDeplacer();  // une méthode abstraite
	
	public void accelerer(); // une méthode abstraite
	
	// Java 8 : possibilité d'avoir des méthodes concretes avec default ou static
	
	public default void info() {
		System.out.println("Hello Interface");
	}
	public static void infoStatic() {
		System.out.println("Hello static Interface");
	}
	// Java 9+: On peut avoir des méthodes private concretes
	private void display() {}
	private static void displayStatic() {}
}
