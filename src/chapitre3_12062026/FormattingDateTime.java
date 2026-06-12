package chapitre3_12062026;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDateTime {

	public static void main(String[] args) {
		// 3)Formatting date time
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld); // format ISO
		
		DateTimeFormatter formatF = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter formatL = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter formatM = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatS = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

		System.out.println(ld.format(formatF));
		System.out.println(formatF.format(ld));
		
		System.out.println(ld.format(formatL));
		System.out.println(ld.format(formatM));
		System.out.println(ld.format(formatS));
		
		DateTimeFormatter customformat = DateTimeFormatter.ofPattern("dd * MM - yy");
		System.out.println(ld.format(customformat));
		
	}

}
