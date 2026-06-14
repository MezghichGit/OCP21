package chapitre3_14062026;

public class Animal {
	int id;

	public Animal(int id) {
		super();
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Animal)) return false;
		Animal temp = (Animal) obj;
		return (this.id == temp.id); 
	}

}
