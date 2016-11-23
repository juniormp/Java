package Collections.ListExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();

		// adding values
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		// Searching values with Iterator
		Iterator<Integer> i = arrayList.iterator();
		while (i.hasNext()) {
			System.out.println("Iterator: " + i.next());
		}

		// Searching values with Enhanced-for
		for (Integer j : arrayList) {
			System.out.println("Enhanced-for: " + j);
		}

		// -- Methods from Collection Interface

		// Add an Object - return boolean
		arrayList.add(6);

		// Add an Collection Object to the list - return boolean
		List<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(1);
		arrayList2.add(2);
		arrayList2.add(3);
		arrayList.add(4);
		arrayList2.add(5);
		arrayList.addAll(arrayList2);

		// Check if contains the element specified - return boolean
		arrayList.contains(2);

		// Check if there are elements - return boolean
		arrayList.isEmpty();

		// Check size - return int
		arrayList.size();

		// Remove element specified - return boolean
		arrayList.remove(2);

		// Return an Object array containing all elements from the list
		arrayList.toArray();

		// Remove all values - return void
		arrayList2.clear();

		// -- Methods from List Class

		// Add an Object at the specified position - return void
		arrayList.add(1, 3);

		// Add a Collection Object to specified position - return boolean
		arrayList.addAll(1, arrayList2);

		// Return the element
		arrayList.get(3);

		// Return a list iterator
		arrayList.listIterator();

	}

}
