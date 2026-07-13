package day8_12072026.chapitreException;

public class LesExceptions {

	public static void main(String[] args) {
		int x = 20;
	    //int y = 10;
		int y = 0;
		String nom = null;
		int tab[]= {10,3,2};
		
		try {
			System.out.println(tab[3]);
			nom.length();
			System.out.println(x / y);
		} catch (ArithmeticException ex) {
			
			System.out.println("Problème de division par zéro! : "+ ex.getMessage());
			ex.printStackTrace();
			return;
		}
		catch (NullPointerException ex) {
			
			System.out.println("Problème de pointeur null! : "+ ex.getMessage());
			ex.printStackTrace();
			return;
		}
		catch (Exception ex) {
			
			System.out.println("Problème ! : "+ ex.getMessage());
			ex.printStackTrace();
			return;
		}
        finally {
		System.out.println("Fin du programme");
        }

	}

}
