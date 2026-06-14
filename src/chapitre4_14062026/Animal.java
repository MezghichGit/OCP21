package chapitre4_14062026;

public abstract class Animal {
	
	// méthode concrete
	public static String infos(int age, String espece) throws NullPointerException, ArithmeticException{
		
		return "Infos : ";
		
	}
	
	public abstract void eat(); // méthode abstraite

}
