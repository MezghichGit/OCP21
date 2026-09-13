package day14_13092026.generics;

public class Methodes_Generic {

	public static <T> void infos(T t) {
		System.out.println(t);
	}
	
	
	public static void main(String[] args) {
		infos("OCP");
		infos(10);
		infos(true);

	}

}
