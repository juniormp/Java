package apiCollections.setExample;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PerformanceTest {

	public static void main(String[] args) {

		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();
		Instant start, end;
		Duration duration;

		// Adding

		start = Instant.now();
		for (int i = 0; i < 500_000; i++)
			hashSet.add(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Add - HashSet - " + duration.toMillis() + " milliseconds");

		start = Instant.now();
		for (int i = 0; i < 500_000; i++)
			linkedHashSet.add(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Add - LinkedHashSet - " + duration.toMillis() + " milliseconds");

		start = Instant.now();
		for (int i = 0; i < 500_000; i++)
			treeSet.add(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Add - TreeSet - " + duration.toMillis() + " milliseconds");

		// Searching

		start = Instant.now();
		for (int i = 0; i < 500; i++)
			hashSet.contains(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Get - HashSet - " + duration.toMillis() + " milliseconds");

		start = Instant.now();
		for (int i = 0; i < 500; i++)
			linkedHashSet.contains(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Get - LinkedHashSet - " + duration.toMillis() + " milliseconds");

		start = Instant.now();
		for (int i = 0; i < 500; i++)
			treeSet.contains(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Get - TreeSet - " + duration.toMillis() + " milliseconds");

		// Removing

		start = Instant.now();
		for (int i = 0; i < 500; i++)
			hashSet.remove(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Remove - HashSet - " + duration.toMillis() + " milliseconds");

		start = Instant.now();
		for (int i = 0; i < 500; i++)
			linkedHashSet.remove(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Remove - LinkedHashSet - " + duration.toMillis() + " milliseconds");

		start = Instant.now();
		for (int i = 0; i < 500; i++)
			treeSet.remove(i);
		end = Instant.now();
		duration = Duration.between(start, end);
		System.out.println("Remove - TreeSet - " + duration.toMillis() + " milliseconds");

	}

}
