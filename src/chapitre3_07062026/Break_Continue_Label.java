package chapitre3_07062026;

public class Break_Continue_Label {

	public static void main(String[] args) {
		outer : for(int i = 0; i<10; i++)
		{
			for(int j = 0; j<10; j++)
			{
				//if(j==5) break outer;
				if(j==5) continue outer;
				System.out.println("i,j : "+i+","+j);
			}
		}
		
		System.out.println("Fin de la recherche");

	}

}
