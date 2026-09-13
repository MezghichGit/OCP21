package day14_13092026.generics.bounds;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		a = b; // upcasting
		
		List<A> la = new ArrayList<>();
		List<B> lb = new ArrayList<>();
		List<C> lc = new ArrayList<>();
		la = lb;  // does not compile
		
		List<? extends C> l;  //upper bound
		l = lb;
		
		
		List<? super B> low;  // lower bound
		low = lb;
		low = lc;
		low = la;
		
		List<?> lo;  // Unbounded
		lo = la;

	}

}
