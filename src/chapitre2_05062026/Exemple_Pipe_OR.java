package chapitre2_05062026;

public class Exemple_Pipe_OR {

	public static void main(String[] args) {
		int x = 6;
		//boolean y = (x >= 6) || (++x <= 7);
		boolean y = (x >= 6) | (++x <= 7);
		System.out.println(x);

	}

}
