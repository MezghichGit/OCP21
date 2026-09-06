package day13_06092026;

public class Weather {
	   public enum Forecast {
	       SUNNY, CLOUDY, RAINY;

	       @Override
	       public String toString() {
	           return "SNOWY";
	       }
	   }

	   public static void main(String[] args) {
	       System.out.print(Forecast.SUNNY.ordinal() + " ");
	       System.out.print(Forecast.CLOUDY.ordinal() + " ");
	       System.out.print(Forecast.RAINY.ordinal() + " ");
	       System.out.print(Forecast.valueOf("cloudy".toUpperCase()));
	       System.out.print(Forecast.RAINY);
	   }
	}