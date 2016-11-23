package Collections.ListExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<Integer> linkedList = new LinkedList<Integer>();
		
		// adding values
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);

		// Searching values with Iterator
		Iterator<Integer> i = linkedList.iterator();
		while (i.hasNext()) {
			System.out.println("Iterator: " + i.next());
		}

		// Searching values with Enhanced-for
		for (Integer j : linkedList) {
			System.out.println("Enhanced-for: " + j);
		}
		
		// There are more methods from Collection List Interface to implement

	}

}
