package chapitre1_31052026;

import java.util.List;
//import java.lang.String;
public class Animal {
	
	//attributs d'instance
	String espece;
	int age;
	String nom;
	double poids;
	List<String> foods;
	
	// attributs de classe
	static int MAX_AGE;
	
	// méthodes d'instance
	
	public void infos()
	{
		System.out.println("Animal [espece=" + this.espece + ", age=" + this.age + ", nom=" + this.nom + ", poids=" + this.poids + "]");
	}
	
	// méthode de classe
	
	public static void getMax_Age()
	{
		System.out.println("Age max d'un Animal : "+MAX_AGE);
	}

	// constructeur par défaut
	public Animal()
	{
		System.out.println("Construction Animal");
	}
    // constructeur avec paramètres

	public Animal(String espece, int age, String nom, double poids) {
		this.espece = espece;
		this.age = age;
		this.nom = nom;
		this.poids = poids;
		System.out.println("Construction Animal avec les attributs");
	}
	
	// bloc d'initialisation d'instance
	{
		int n = 10;
		System.out.println("Instance bloc 1: Hello OCP 21");
	}
	
	// bloc d'initialisation de classe
	static {
		System.out.println("Static bloc : Hello OCP 21");
	}
	
	// bloc d'initialisation d'instance
	{
			int n = 10;
			System.out.println("Instance bloc 2: Hello OCP 21");
	}
		
}
