package day13_06092026;

public class Q22 {

	public static void main(String[] args) {
		String s = "10_00";
		Integer s2 = 10_00;
		// Line n1
		//Integer res = 250 + Integer.parseInt(s);
		Integer res = 250 + Integer.valueOf(s);
		System.out.println(res);

	}

}
