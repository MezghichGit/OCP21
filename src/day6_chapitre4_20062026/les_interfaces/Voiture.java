package day6_chapitre4_20062026.les_interfaces;

public class Voiture implements Vehicule{

	@Override
	public void seDeplacer() {
		System.out.println("Une voiture qui se déplace");
		
	}

	@Override
	public void accelerer() {
		System.out.println("Une voiture qui accèlère");
	}

}
