package day9_09082026_Locale;

import java.util.*;

public class ZooOpen {

	public static void main(String[] args) {
		Locale us = new Locale("en", "US");
		Locale france = new Locale("fr", "FR");

		//printProperties(us);
		//System.out.println();
		printProperties(france);
		
		//Locale us2 = new Locale("en", "US");
		//ResourceBundle rb = ResourceBundle.getBundle("Zoo", us2);
		//Set<String> keys = rb.keySet();
		//keys.stream().map(k -> k + " " + rb.getString(k)).forEach(System.out::println);
	}

	public static void printProperties(Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		//System.out.println(rb.getString("hello"));
		//System.out.println(rb.getString("open"));
		
		Properties props = new Properties();
		rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));
		System.out.println(props.getProperty("hello"));
		System.out.println(props.getProperty("hello", "123"));
	}
}