package Collections.ListExample;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		List<Integer> vectorList = new Vector<Integer>();

		// adding values
		vectorList.add(1);
		vectorList.add(2);
		vectorList.add(3);
		vectorList.add(4);
		vectorList.add(5);

		// Searching values with Iterator
		Iterator<Integer> i = vectorList.iterator();
		while (i.hasNext()) {
			System.out.println("Iterator: " + i.next());
		}

		// Searching values with Enhanced-for
		for (Integer j : vectorList) {
			System.out.println("Enhanced-for: " + j);
		}

		// There are more methods from Collection and List Interface to implement
	}

}
