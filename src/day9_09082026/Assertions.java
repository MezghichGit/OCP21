package day9_09082026;

public class Assertions {
  public static void main(String[] args) {
  int numGuests = -5;
  assert (numGuests > 0):"Nbre de guests est négatif";
  System.out.println(numGuests);
}
}