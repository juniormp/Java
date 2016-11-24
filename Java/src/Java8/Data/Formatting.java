package Java8.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatting {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter;

		System.out.println(" 1.Current date ");
		System.out.println(localDate);

		System.out.println("\n 2.Current date and time");
		System.out.println(localDateTime);
		
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("\n 3.Current format date  ");
		System.out.println(localDate.format(formatter));
		
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		System.out.println("\n 3.Current format date and time ");
		System.out.println(localDateTime.format(formatter));
		
		
		
		
	}

}
