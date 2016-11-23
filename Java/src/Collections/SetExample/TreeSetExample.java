package Collections.SetExample;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		Set<Integer> treeSet = new TreeSet<Integer>();

		// adding values
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(5);

		// adding values
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(5);

		// Searching values with Iterator
		Iterator<Integer> i = treeSet.iterator();
		while (i.hasNext()) {
			System.out.println("Iterator: " + i.next());
		}

		// Searching values with Enhanced-for
		for (Integer j : treeSet) {
			System.out.println("Enhanced-for: " + j);
		}
		
		// There are more methods from Collection Interface to implement

	}
}
