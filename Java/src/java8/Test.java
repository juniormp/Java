package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

class Test {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Rick");
		list.add("Carl");
		list.add("Gleen");

		// Before Java 1.8 **********************************************

		// Ordering A-Z
		Collections.sort(list);
		System.out.println(list);

		// Ordering by size
		Comparator<String> comparator = new ComparateStringByLenght();
		Collections.sort(list, comparator);
		System.out.println(list);

		// After Java 1.8 **********************************************

		Comparator<String> compartor = new ComparateStringByLenght();
		list.sort(compartor); // Sort is a Default method (sort), there is a
								// method
								// body into the interface List

		Consumer<String> consumer = new ConsumerString();
		list.forEach(consumer);

		// or we can implement like anonymous class the interface consumer

		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String text) {
				System.out.println(text);
			}
		});

		// with the new Java 8 syntax (lambdas) we can shortened the code above
		// accept is the only default method in consumer so we can use lambda

		list.forEach((String text) -> {
			System.out.println(text);
		});

		// shortened once again using lambda

		list.forEach(s -> System.out.println(s));

		// Other example using Comparator

		list.sort(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {

				if (s1.length() < s2.length())
					return -1;

				if (s1.length() > s2.length())
					return 1;

				return 0;
			}
		});

		// Shortened using lambda

		list.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;

			if (s1.length() > s2.length())
				return 1;

			return 0;
		});
		
		// or to sort we can use the method compare in Integer class
		
		list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

	}

}
