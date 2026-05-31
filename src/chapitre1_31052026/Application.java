package chapitre1_31052026;
/*
import chapitre1_31052026.packA.A;
import chapitre1_31052026.packA.B;
import chapitre1_31052026.packA.C;
import chapitre1_31052026.packB.D;
import chapitre1_31052026.packB.E;
*/
import chapitre1_31052026.packA.*;
import chapitre1_31052026.packB.*;
//import chapitre1_31052026.packA.C;

import static chapitre1_31052026.utilitaire.MathTools.PI;
import static chapitre1_31052026.utilitaire.MathTools.getPI;
public class Application {

	int k; // attribut d'instance
	
	static int m; // attribut de classe
	public void info()
	{
		int x; // variable locale!!!
		System.out.println(x);
		System.out.println(this.k);
		System.out.println(m);
	}
	public static void main(String[] args) {
		System.out.println(PI);
		getPI();
		A a = new A();
		B b = new B();
		chapitre1_31052026.packA.C  c = new chapitre1_31052026.packA.C();
		D d = new D();
		E e = new E();

	}

}
