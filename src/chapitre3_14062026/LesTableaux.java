package chapitre3_14062026;

public class LesTableaux {

	public static void main(String[] args) {
		int  tab[] = {2,4,9};
		System.out.println(tab[0]);
		String cours[] = new String[3];
		
		cours[0]="Java";
		cours[1]="OCP";
		cours[2]="CKAD";
		
		double moy[][]= {{15,20,19},{20,19},{9,12,10,8}};
		System.out.println(moy[2][1]);
		System.out.println(moy.length);
		System.out.println(moy[0].length);
		System.out.println(moy[1].length);
		System.out.println(moy[2].length);
		
		// Parcours du tableau avec enhanced loop
		
		for(double t[] : moy)
		{
			for(double x : t)
			{
				System.out.print(x+"\t");
			}
			System.out.println();
		}
	}

}
