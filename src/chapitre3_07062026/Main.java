package chapitre3_07062026;

public class Main {
	public static void printSeason(int month) {
		switch(month) {
		case 1: case 2 : case 3: System.out.print("Winter"); break;
		case 4, 5, 6: System.out.print("Spring"); break;
		default: System.out.print("Unknown"); break;
		case 7, 8, 9: System.out.print("Summer"); break;
		case 10, 11, 12: System.out.print("Fall"); break;
		
		} }

	public static void main(String[] args) {
		
		printSeason(2);
		int a = 100;
		int b = 200;
		
		int res = (a<b)?(a>20)?1:2:b;
		
		//int y = (a>b)?true:"OCP";
		System.out.println(res);
		
		System.out.println((a>b)?true:"OCP");
	}

}
