package chapitre1_31052026.exempleGC;

public class Voiture {
	
	public void finalize()
	{
		System.out.println("Destruction de l'objet voiture");
	}

}
