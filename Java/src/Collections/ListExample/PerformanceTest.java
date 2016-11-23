package Collections.ListExample;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class PerformanceTest {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> vectorList = new Vector<Integer>();
		Instant start, end;
		Duration duration;

		// Adding

		start = Instant.now();
		for (int i = 0; i < 500_000; i++)
			arrayList.add(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Add - ArrayList - " + duration.toMillis() + " milliseconds");

		start = Instant.now();
		for (int i = 0; i < 500_000; i++)
			linkedList.add(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Add - LinkedList - " + duration.toMillis() + " milliseconds");

		start = Instant.now();
		for (int i = 0; i < 500_000; i++)
			vectorList.add(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Add - Vector - " + duration.toMillis() + " milliseconds");

		// Searching

		start = Instant.now();
		for (int i = 0; i < 500; i++)
			arrayList.get(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Get - ArrayList - " + duration.toMillis() + " milliseconds");

		start = Instant.now();
		for (int i = 0; i < 500; i++)
			linkedList.get(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Get - LinkedList - " + duration.toMillis() + " milliseconds");

		start = Instant.now();
		for (int i = 0; i < 500; i++)
			vectorList.get(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Get - Vector - " + duration.toMillis() + " milliseconds");

		// Removing

		start = Instant.now();
		for (int i = 0; i < 500; i++)
			arrayList.remove(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Remove - ArrayList - " + duration.toMillis() + " milliseconds");

		start = Instant.now();
		for (int i = 0; i < 500; i++)
			linkedList.remove(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Remove - LinkedList - " + duration.toMillis() + " milliseconds");

		start = Instant.now();
		for (int i = 0; i < 500; i++)
			vectorList.remove(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Remove - Vector - " + duration.toMillis() + " milliseconds");

	}

}
