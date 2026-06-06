package chapitre2_05062026;

public class OperateurInstanceOf {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		boolean res = a instanceof A;
		System.out.println(res);
		boolean res2 = b instanceof A;
		System.out.println(res2);
		
		boolean res3 = a instanceof B;
		System.out.println(res3);

	}

}
