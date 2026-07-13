package day8_12072026.chapitreException;

public class Throw_vs_Throws {

	public static void infosChecked() throws Exception
	{
		throw new Exception("Problème");
	}
	
	public static void infosUnchecked() throws RuntimeException
	{
		throw new RuntimeException("Problème");
	}
	public static void main(String[] args) throws Exception {
		try {
			infosChecked();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		infosChecked();
		infosUnchecked();  

	}

}
