package Java8.Data;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TimeZone {

	public static void main(String[] args) {

		LocalTime localTime;
		
		System.out.println(" \n 1.Working with time zone");
		localTime = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Current time in Los Angeles time zone: " + localTime);
		localTime = LocalTime.now(Clock.systemUTC());
		System.out.println("Current time in UTC time zone: " + localTime);
		
		System.out.println("\n **************************************");
		
		System.out.println("\n 2.Working with time zone");
		ZoneId losAngeles = ZoneId.of("America/Los_Angeles");
		System.out.println("ZoneID Los Angeles: " + losAngeles);
		ZoneId berlin = ZoneId.of("Europe/Berlin");
		System.out.println("ZoneID Berlin: " + berlin);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("\nCurrent Date and Time: " + dateTime);
		 
		ZonedDateTime berlinDateTime = ZonedDateTime.of(dateTime, berlin);
		System.out.println("Current Date and Time in Berlin: " + berlinDateTime);
		
		ZonedDateTime losAngelesDateTime = ZonedDateTime.of(dateTime, losAngeles);
		System.out.println("Current Date and Time in Los Angeles: " + losAngelesDateTime);
		 
		losAngelesDateTime = berlinDateTime.withZoneSameInstant(losAngeles);
		System.out.println("\nTime in Los Angeles comparing to Berlin: "+ losAngelesDateTime);
		 
		int offsetInSeconds = losAngelesDateTime.getOffset().getTotalSeconds(); // -28800
		System.out.println("Time in Los Angeles comparing to Berlin in seconds: " + offsetInSeconds);		
		
		
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println("\n 3.All zone ids: ");
		allZoneIds.forEach(System.out::println);
	}
	

}
