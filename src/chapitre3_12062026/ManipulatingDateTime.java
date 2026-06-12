package chapitre3_12062026;

import java.time.LocalDate;

public class ManipulatingDateTime {

	public static void main(String[] args) {
		// 2)Manipulating Date Time
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		ld = ld.minusDays(2);
		//System.out.println(ld.minusDays(2));
		System.out.println(ld);

	}

}
