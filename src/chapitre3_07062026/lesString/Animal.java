package chapitre3_07062026.lesString;

import java.util.ArrayList;
import java.util.List;

public final class Animal {
	
	private String espece;
	private int age;
	private List<String>foods;
	
	
	public String getEspece() {
		return espece;
	}
	public int getAge() {
		return age;
	}
	public List<String> getFoods() {
		return new ArrayList(foods);
	}
	public Animal(String espece, int age, List<String> foods) {
		super();
		this.espece = espece;
		this.age = age;
		this.foods = new ArrayList(foods);
	}
	
	

}
