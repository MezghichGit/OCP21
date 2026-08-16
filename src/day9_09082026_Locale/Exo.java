package day9_09082026_Locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class Exo {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("hi"));
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", new Locale("en","US"));
		System.out.println(rb.getString("hello2"));

	}

}
