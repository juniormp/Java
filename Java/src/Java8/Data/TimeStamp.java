package Java8.Data;

import java.time.Instant;

public class TimeStamp {

	public static void main(String[] args) {

		Instant instant;

		System.out.println(" Time on Mahcine perspective");

		System.out.println("\n 1. Current time");
		instant = Instant.now();
		System.out.println(instant);

		// from unix timestamp, 2010-01-01 12:00:00
		instant = Instant.ofEpochSecond(1262347200);
		System.out.println(instant);

		// same time in millis
		instant = Instant.ofEpochMilli(1262347200000l);
		System.out.println(instant);

		// parsing from ISO 8601
		instant = Instant.parse("2010-01-01T12:00:00Z");
		System.out.println(instant);

		// toString() returns ISO 8601 format
		String toIso8601 = instant.toString();
		System.out.println(toIso8601);

		// as unix timestamp
		long toUnixTimestamp = instant.getEpochSecond();
		System.out.println(toUnixTimestamp);

		// in millis
		long toEpochMillis = instant.toEpochMilli();
		System.out.println(toEpochMillis);

		// plus/minus methods are available too
		Instant nowPlusTenSeconds = instant.plusSeconds(10);
		System.out.println(nowPlusTenSeconds);

	}

}
