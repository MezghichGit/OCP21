package day7_05072026;

@FunctionalInterface
public interface Gorilla {
	
	String move(); 
	
	default public void display() {
		System.out.println("Hello World");
	}
}
