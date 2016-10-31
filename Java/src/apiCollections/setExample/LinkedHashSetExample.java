package apiCollections.setExample;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();

		// adding values
		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(3);
		linkedHashSet.add(4);
		linkedHashSet.add(5);

		// adding values
		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(3);
		linkedHashSet.add(4);
		linkedHashSet.add(5);

		// Searching values with Iterator
			
		Iterator<Integer> i = linkedHashSet.iterator();
		while (i.hasNext()) {
			System.out.println("Iterator: " + i.next());
		}

		// Searching values with Enhanced-for
		for (Integer j : linkedHashSet) {
			System.out.println("Enhanced-for: " + j);
		}

		// There are more methods from Collection Interface to implement
	}
}
