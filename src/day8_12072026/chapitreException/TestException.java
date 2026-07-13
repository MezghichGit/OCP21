package day8_12072026.chapitreException;

public class TestException {

	public static void main(String[] args) {
		System.out.println("Begin");
		
		int tab[]= {10,2};
		try {
		System.out.println(tab[2]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("End");

	}

}
