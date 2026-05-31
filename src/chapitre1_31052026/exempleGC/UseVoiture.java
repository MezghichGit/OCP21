package chapitre1_31052026.exempleGC;

class Use {}
public class UseVoiture {

	public static void main(String[] args) {
		Voiture v1 = new Voiture();
		Voiture v2 = new Voiture();
		Voiture v3 = new Voiture();
		//v3 = null;
		v1 = v2;
		System.gc();

	}

}
