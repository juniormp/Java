package apiCollections.queueExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<Integer> queueList = new LinkedList<>();

		// Adding
		queueList.add(1);
		queueList.add(2);
		queueList.add(3);
		queueList.add(4);
		queueList.add(5);

		// Searching values with Iterator
		Iterator<Integer> i = queueList.iterator();
		while (i.hasNext()) {
			System.out.println("Iterator: " + i.next());
		}

		// Searching values with Enhanced-for
		for (Integer j : queueList) {
			System.out.println("Enhanced-for: " + j);
		}

		// Tail - The last element in the queue
		// Head - The first element in the queue
		// Add an element in the tail of the queue - return boolean
		queueList.offer(100);

		// Get the element of the head of this queue - return null if is empty
		queueList.peek();

		// Get the element of the head of this queue -  If its empty throws NoSuchElementException
		// is empty
		queueList.element();

		// Remove the head of this queue - return null if is empty
		queueList.poll();

		// Remove the head of this queue - if its empty throws NoSuchElementException
		queueList.remove();

		// Searching values with Enhanced-for
		for (Integer j : queueList) {
			System.out.println("Enhanced-for: " + j);
		}

		// There are methods from Collection interface to implement
		
	}

}
