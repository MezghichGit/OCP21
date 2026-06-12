package chapitre3_12062026;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CreateDateTime {

	public static void main(String[] args) {
		// 1)Creating Date Time
		LocalDate ld = LocalDate.now(); // static methods
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt);
		ZoneId z = ZoneId.of("Africa/Tunis");
        System.out.println(z);
        ZonedDateTime zdt = ZonedDateTime.of(ldt, z);
        System.out.println(zdt);
        
        LocalDate ld2 = LocalDate.of(1985, 7, 10);
        LocalTime lt2 = LocalTime.of(10, 0);
        LocalDateTime ldt2= LocalDateTime.of(ld2,lt2);
        
        System.out.println(ldt2);

	}

}
