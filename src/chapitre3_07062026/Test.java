package chapitre3_07062026;

public class Test {

	public static void printDayOfWeek2(int day) {
		var result = switch(day) {
		case 0 -> "Sunday";
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> "Invalid value";
		};
		System.out.print(result);

		}
	public static void printDayOfWeek(int day) {
		switch(day) {
		case 0 -> System.out.println("Sunday");
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		default -> System.out.println("Invalid value");
		};
		//System.out.print(result);
		}

	public static void main(String[] args) {
		printDayOfWeek(3);
		int day=2;
		
	String res = switch (day) {
	    case 1 -> {
	        System.out.println("Calcul...");
	        yield "Monday";
	    }
	    default -> "Unknown";
	};
	int temp = 2;
	final int val = 10;
	switch(temp)
	{
	case 1 : System.out.println("1"); break;
	case val : System.out.println("1"); break;
	}

	
	int fish = 5;
	int length = 12;
	var name = switch(fish) {
	case 1 -> "Goldfish";
	case 2 -> {yield "Trout";}
	case 3 -> {
	if(length > 10) yield "Blobfish";
	else yield "Green";
	}
	default -> "Swordfish";
	};

	int value = 10;
	switch (value) {
	    default -> System.out.println("A");
	}
	
	}

}
