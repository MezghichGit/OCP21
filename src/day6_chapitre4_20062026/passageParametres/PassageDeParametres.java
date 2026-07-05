package day6_chapitre4_20062026.passageParametres;

public class PassageDeParametres {

	public  static void permut(int a, int b)
	{  // a et b sont les paramètres formels
		System.out.println("Paramètres formels avant permutation : a = "+a+" b = "+b);
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println("Paramètres formels après permutation : a = "+a+" b = "+b);
	}
	
	
	// cas de variables type reference mutables: StringBuilder
	
	public static void permutSB(StringBuilder sb)
	{
		sb.append("-OCP");
	}
	
	public static void main(String[] args) {
		// x et y sont les paramètres effectifs
		/*
		int x = 10;
		int y = 20;
		System.out.println("Paramètres effectifs avant permutation : x = "+x+" y = "+y);
		permut(x,y);
		System.out.println("Paramètres effectifs après permutation : x = "+x+" y = "+y);
		*/

	}

}
