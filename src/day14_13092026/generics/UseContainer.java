package day14_13092026.generics;

import java.util.ArrayList;

public class UseContainer {

	public static void main(String[] args) {
		
		ArrayList a;
		
		Container<String> cs = new Container<>("OCP21");
		cs.display();
		
		Container<Integer> ci = new Container<>(2026);
		ci.display();
		
		

	}

}
