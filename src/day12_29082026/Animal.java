package day12_29082026;

import java.io.Serializable;

public class Animal implements Serializable {
    /*
	private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private char type;

    public Animal(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public char getType() { return type; }

    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
    }
    */
	   private static final long serialVersionUID = 2L;
	    private transient String name;
	    private transient int age = 10;
	    private static char type = 'C';

	    // Bloc d'initialisation d'instance
	    {
	        this.age = 14;
	    }

	    // Constructeur par défaut
	    public Animal() {
	        this.name = "Unknown";
	        this.age = 12;
	        this.type = 'Q';
	    }

	    // Constructeur avec paramètres
	    public Animal(String name, int age, char type) {
	        this.name = name;
	        this.age = age;
	        this.type = type;
	    }
	    
	    // Méthode toString
	    @Override
	    public String toString() {
	        return "Animal{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                ", type=" + type +
	                '}';
	    }

}