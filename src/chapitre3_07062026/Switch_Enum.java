package chapitre3_07062026;

public class Switch_Enum {

	//NON var nom;
	
	//NON static var prenom;
	
	
	enum Season {WINTER, SPRING, SUMMER, FALL}
	///static String getWeather(Season value, // NON var b) {
	static String getWeather(Season value) {
	return switch(value) {
	case WINTER -> "Cold";
	case SPRING -> "Rainy";
	case SUMMER -> "Hot";
	case FALL -> "Warm";
	
	};
	//return x;
	}

	public static void main(String[] args) {
		System.out.println(getWeather(Season.FALL));
         var x = 10;
         x = 12;
         x = "amine";
	}

}
