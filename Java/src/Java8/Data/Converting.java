package Java8.Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class Converting {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime;
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		Instant instant = Instant.now();
		
		System.out.println(" 1. Date and Time Object to LocalDateTime Object");
		localDateTime = LocalDateTime.of(localDate, localTime);
		System.out.println(localDateTime);
		
		System.out.println("\n 2. LocalDateTime Object to Date and Time Object");
		localDate = localDateTime.toLocalDate();
		localTime = localDateTime.toLocalTime();
		System.out.println(localDate + "  " + localTime);
		
		System.out.println("\n 3. Instant Object to LocalDateTime Object - time in Los Angeles");
		localDateTime = LocalDateTime.ofInstant(instant, ZoneId.of("America/Los_Angeles"));
		System.out.println(localDateTime);
		
		System.out.println("\n 4. LocalDateTime Object to Instant Object");
		instant = localDateTime.toInstant(ZoneOffset.ofHours(-2));
		System.out.println(localDateTime);
		
		System.out.println("\n **************************************");
		
		System.out.println("\n 5. Date Object to Instant Object");
		instant = new Date().toInstant();
		System.out.println(instant);
		
		System.out.println("\n 6. Calendar Object to Instant Object");
		instant = Calendar.getInstance().toInstant();
		System.out.println(instant);
		
		System.out.println("\n 7. Instant Object to Date Object");
		Date date = Date.from(Instant.now());
		System.out.println(date);
		
	}

}
