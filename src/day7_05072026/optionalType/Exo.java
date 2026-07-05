package day7_05072026.optionalType;

public class Exo {

	public static void main(String[] args) {
		Object obj = "Hello Java 21";

        switch (obj) {
        
	        case String s && s.length() > 5 ->
	        System.out.println("Long");

            case String s ->
                System.out.println("String");

            default ->
                System.out.println("Autre");
        }

	}

}
