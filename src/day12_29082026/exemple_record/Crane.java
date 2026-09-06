package day12_29082026.exemple_record;

public record Crane(int numberEggs, String name) {
	/*public Crane(int numberEggs, String name) {  // Long Constructor
		if (numberEggs < 0)
			throw new IllegalArgumentException();
		this.numberEggs = numberEggs;
		this.name = name;
	}*/
	
	public Crane {  // Long Constructor
		if (numberEggs < 0)
			throw new IllegalArgumentException();
		
		name = "OCP : "+name;
	}
}
