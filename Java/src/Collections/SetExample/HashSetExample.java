package Collections.SetExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<Integer> hashSet = new HashSet<Integer>();

		// adding values
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		hashSet.add(5);

		// Searching values with Iterator
		Iterator<Integer> i = hashSet.iterator();
		while (i.hasNext()) {
			System.out.println("Iterator: " + i.next());
		}

		// Searching values with Enhanced-for
		for (Integer j : hashSet) {
			System.out.println("Enhanced-for: " + j);
		}
		
		// There are more methods from Collection Interface to implement
	}

}
