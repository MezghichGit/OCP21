package day7_05072026;
import java.util.Date;
import java.util.function.Supplier;
public class Methode_reference_Constructeur {

	public static void main(String[] args) {
		
		// implementation par lamba
		Supplier<Date> founisseur = ()->new Date();
		System.out.println(founisseur.get());
		
		// implementation par méthode reference constructeur
		Supplier<Date> mr = Date::new;
		System.out.println(mr.get());
	}

}
