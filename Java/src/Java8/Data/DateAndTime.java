package Java8.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateAndTime {

	public static void main(String[] args) {

		LocalDate localDate;
		LocalTime localTime;
		LocalDateTime localDateTime;

		System.out.println(" 1.Current date");
		localDate = LocalDate.now();
		System.out.println(localDate);

		System.out.println(" \n 2.Set date");
		localDate = LocalDate.of(2016, 9, 25);
		System.out.println(localDate);
		localDate = LocalDate.of(2016, Month.SEPTEMBER, 25);
		System.out.println(localDate);
		localDate = LocalDate.ofYearDay(2016, 10);
		System.out.println(localDate);

		System.out.println(" \n 3.Current Date Time");
		localTime = LocalTime.now();
		System.out.println(localTime);

		System.out.println(" \n 4.Set Date Time");
		localTime = LocalTime.of(14, 35);
		System.out.println(localTime);
		localTime = LocalTime.of(14, 35, 20);
		System.out.println(localTime);
		localTime = LocalTime.ofSecondOfDay(27000);
		System.out.println(localTime);

		System.out.println(" \n 5.Working with Date and Time");
		localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		localDateTime = LocalDateTime.of(2016, Month.JULY, 24, 12, 0);
		System.out.println(localDateTime);

		System.out.println("\n **************************************");
		
		System.out.println(" \n 6.Manipulating Date, Time, DateTime");
		localDateTime = LocalDateTime.now();
		Month month = localDateTime.getMonth(); // We can do the same with Year and Day
		int minLenght = month.minLength();
		int maxLenght = month.maxLength();
		System.out.println(month + " " + minLenght + " " + maxLenght);
		month = month.firstMonthOfQuarter();
		System.out.println(month);
		
		System.out.println(" \n 7.Manipulating Date, Time, DateTime");
		localDate = LocalDate.now().plusDays(1); // We can do the same with days, weeks, months, years
		System.out.println("Tomorrow: " + localDate);
		localDate = LocalDate.now().minusWeeks(2);
		System.out.println("Two weeks ago: " + localDate);
		
		System.out.println("\n **************************************");
		
		System.out.println(" \n 8.Periods");
		
		LocalDate firstDate = LocalDate.of(2016, 5, 17); 
		System.out.println("Firt Date: " + firstDate);
		LocalDate secondDate = LocalDate.of(2016, 6, 7);
		System.out.println("Second Date: " + secondDate);
		
		Period period = Period.between(firstDate, secondDate);
		int days = period.getDays(); 
		int months = period.getMonths(); 
		int years = period.getYears(); 
		System.out.println("Period between first and second date: " + days + " Days, " + months + " Months, " + years + " Years");
	
		boolean isNegative = period.isNegative(); 
		System.out.println("The period is negative? " + isNegative);
		

	}

}
